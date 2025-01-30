package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Turn lights on, if it is raining and car is running (>100) or is dark.
 */
public class LightsOn {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int MAX_CAR_SPEED = 100;
        boolean isRaining = false;
        boolean isDark = false;
        boolean isCarRunning = false;
        int carSpeed = 0;
        boolean lightsOn = false;

        System.out.println("Please insert if it is raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark");
        isDark = in.nextBoolean();

        System.out.println("Please insert the speed of the car");
        carSpeed = in.nextInt();

        isCarRunning = carSpeed > MAX_CAR_SPEED;

        // lights on
        lightsOn = isRaining && (isCarRunning || isDark);

        System.out.println("Lights on: " + lightsOn);
    }
}
