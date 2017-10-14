package com.andrewlinton.calculations.paintCalculator;

import java.util.Scanner;

public class PaintCalculator {

    public static void main(String[] args){
        System.out.print("Enter length: ");
        int length = getInt();
        System.out.print("Enter width: ");
        int width = getInt();
        int area = length * width;
        final double coverage = 350;
        double f = area/coverage;
        long gallons = Math.round(Math.ceil(f));
        System.out.println();
        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet", gallons, area);
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

    static double getArea(double length, double width) {
        return length * width;
    }

}
