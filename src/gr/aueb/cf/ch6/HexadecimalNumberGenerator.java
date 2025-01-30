package gr.aueb.cf.ch6;

import java.io.*;
import java.util.*;

public class HexadecimalNumberGenerator {

    public static void main(String[] args) {
        try {
            // Read integers from a file
            List<Integer> numbers = readNumbersFromFile("input.txt");

            // Validate numbers
            if (numbers.size() < 6 || numbers.size() > 49) {
                throw new IllegalArgumentException("The file must contain between 6 and 49 numbers.");
            }

            for (int number : numbers) {
                if (number < 1 || number > 49) {
                    throw new IllegalArgumentException("All numbers must be between 1 and 49.");
                }
            }

            // Sort the numbers
            Collections.sort(numbers);

            // Generate and filter combinations
            List<List<Integer>> validCombinations = generateAndFilterCombinations(numbers);

            // Write the valid combinations to a file
            writeCombinationsToFile(validCombinations, "output.txt");

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static List<Integer> readNumbersFromFile(String filename) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                for (String part : line.split(",")) {
                    numbers.add(Integer.parseInt(part.trim()));
                }
            }
        }
        return numbers;
    }

    private static List<List<Integer>> generateAndFilterCombinations(List<Integer> numbers) {
        List<List<Integer>> validCombinations = new ArrayList<>();
        int n = numbers.size();
        int[] combination = new int[6];
        generateCombinations(numbers, combination, 0, n - 1, 0, validCombinations);
        return validCombinations;
    }

    private static void generateCombinations(List<Integer> numbers, int[] combination, int start, int end, int index, List<List<Integer>> validCombinations) {
        if (index == 6) {
            List<Integer> currentCombination = Arrays.stream(combination).boxed().toList();
            if (isValidCombination(currentCombination)) {
                validCombinations.add(currentCombination);
            }
            return;
        }

        for (int i = start; i <= end && end - i + 1 >= 6 - index; i++) {
            combination[index] = numbers.get(i);
            generateCombinations(numbers, combination, i + 1, end, index + 1, validCombinations);
        }
    }

    private static boolean isValidCombination(List<Integer> combination) {
        int evenCount = 0, oddCount = 0, sameEndingCount = 0;
        int[] endings = new int[10];
        int[] decimalGroups = new int[5];

        for (int i = 0; i < combination.size(); i++) {
            int num = combination.get(i);

            // Count evens and odds
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            // Count numbers with the same ending
            endings[num % 10]++;

            // Count numbers in the same decimal group
            decimalGroups[(num - 1) / 10]++;

            // Check consecutive numbers
            if (i > 0 && Math.abs(combination.get(i) - combination.get(i - 1)) == 1) {
                sameEndingCount++;
            }
        }

        // Validate criteria
        boolean isValid = evenCount <= 4 && oddCount <= 4 && sameEndingCount <= 2;
        for (int ending : endings) {
            if (ending > 3) {
                isValid = false;
                break;
            }
        }
        for (int group : decimalGroups) {
            if (group > 3) {
                isValid = false;
                break;
            }
        }
        return isValid;
    }

    private static void writeCombinationsToFile(List<List<Integer>> combinations, String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (List<Integer> combination : combinations) {
                writer.write(combination.toString());
                writer.newLine();
            }
        }
    }
}

