package gr.aueb.cf.ch5;

import java.util.Scanner;

public class PowerApp {

    public static void main(String[] args) {
//        for (int base = 1, power = 1; base <= 10; base++, power++)
//            System.out.printf("%,d\n", pow(base, power));

        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;


        System.out.println("Insert base and power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        System.out.println("The result is: " + pow(base, power));
    }

    /**
     * Calculates a^n
     *
     * @param a     the base.
     * @param n     the power.
     * @return      the base raised to the power.
     */
    public static long pow(long a, long n) {
//        long result = 1;
//
//        for (int i = 1; i <= n; i++) {
//            result = a * result;
//        }
//
//        return result;
        return (long) Math.pow(a, n);
    }
}
