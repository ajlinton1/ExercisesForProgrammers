package com.andrewlinton.tips;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {
        TipCalculator tipCalculator = new TipCalculator();
        tipCalculator.process();
    }

    public void process() {
        Scanner in = new Scanner(System.in);
        String line;
        double gross = 0;
        int tipPercentage = 0;

        boolean valid = false;
        while (!valid) {
            try {
                System.out.println("Enter gross amount: ");
                line = in.nextLine();
                gross = Double.parseDouble(line);
                valid = true;
            } catch (Exception ex) {
                System.out.println("Invalid input");
            }
        }

        for (;;) {
            try {
                System.out.println("Enter tip percentage");
                line = in.nextLine();
                tipPercentage = Integer.parseInt(line);
                break;
            } catch (Exception ex) {
                System.out.println("Invalid input");
            }
        }

        double tipAmount = calculateTip(gross, tipPercentage);
        System.out.printf("Tip amount: %.2f", tipAmount);
        System.out.println();
        double total = gross + tipAmount;
        System.out.printf("Total amount: %.2f", total);

    }


    public double calculateTip(double gross, double tipPercentage) {
        double tipAmount = gross * (tipPercentage/100);
        return tipAmount;
    }

}
