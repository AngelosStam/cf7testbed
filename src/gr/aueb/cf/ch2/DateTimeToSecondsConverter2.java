package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DateTimeToSecondsConverter2 {

    public static void main(String[] args) {

        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        int totalSeconds = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Please insert days, hours, minutes and seconds");

        days = in.nextInt();
        hours = in.nextInt();
        minutes = in.nextInt();
        seconds = in.nextInt();

        totalSeconds = (days * 24 * 60 * 60) + (hours * 60 * 60) + (minutes * 60) + seconds;

        System.out.printf("%d days, %d hours, %d minutes and %d seconds is %,d total seconds", days, hours, minutes, seconds, totalSeconds);


    }
}