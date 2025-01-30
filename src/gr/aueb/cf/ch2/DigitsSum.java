package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει από το χρήστη ένα διψήφιο ακέραιο και εκτυπώνει το άθροισμα των ψηφίων του.
 */
public class DigitsSum {

    public static void main(String[] args) {
        int inputNumber = 0;
        int digitsSum = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Παρακαλώ εισάγετε έναν διψήφιο αριθμό");
        inputNumber = in.nextInt();

        digitsSum = inputNumber / 10 + inputNumber % 10;

        System.out.printf("Το άθροισμα των ψηφίων του διψήφιου αριθμού που εισάγατε είναι: %d", digitsSum);


    }
}
