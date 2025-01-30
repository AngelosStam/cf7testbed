package gr.aueb.cf.ch6;

import java.util.Scanner;

public class SymmetricalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Input the elements of the array
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Check if the array is symmetrical
        boolean isSymmetrical = isSymmetrical(arr);

        // Output the result
        if (isSymmetrical) {
            System.out.println("The array is symmetrical.");
        } else {
            System.out.println("The array is not symmetrical.");
        }

        scanner.close();
    }

    // Function to check if an array is symmetrical
    public static boolean isSymmetrical(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false; // Mismatch found
            }
            left++;
            right--;
        }

        return true; // Array is symmetrical
    }
}

