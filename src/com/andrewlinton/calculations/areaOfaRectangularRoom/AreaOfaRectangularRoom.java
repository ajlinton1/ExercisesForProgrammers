package com.andrewlinton.calculations.areaOfaRectangularRoom;

import java.util.Scanner;

public class AreaOfaRectangularRoom {

    public static void main(String[] args) {
        System.out.print("What is the length of the room in feet?");
        int length = getInt();
        System.out.print("What is width on the room in feet?");
        int width = getInt();
        int areaFeet = length * width;
        System.out.println();
        System.out.printf("You entered dimensions of %d feet by %d feet", length, width);
        System.out.println();
        System.out.println("The area is");
        System.out.printf("%d square feed", areaFeet);
        System.out.println();
        double areaMeters = convertToMeters(areaFeet);
        System.out.printf("%.3f square meters", areaMeters);
    }

    static int getInt() {
        int ret = 0;
        Scanner in = new Scanner(System.in);

        for (;;) {
            try {
                String line = in.nextLine();
                ret = Integer.parseInt(line);
                break;
            } catch (Exception ex) {
                System.out.println("Invalid input");
            }
        }

        return ret;
    }

    static double convertToMeters(int feet) {
        final double conversion = 0.09290304;
        double meters = feet * conversion;
        return meters;

    }

}
