package com.andrewlinton.makingDecisions;

import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {
        double amount;
        String state;
        System.out.print("Enter amount: ");
        amount = InputHelper.getDouble();
        System.out.print("Enter state: ");
        state = InputHelper.getString();
        double tax = calculateTax(amount, state);
        double total = amount + tax;
        total =(double)(Math.round(total * 100))/100;

        System.out.printf("Tax is %.02f. \n\rTotal is %.02f", tax, total);
    }

    public static double calculateTax(double amount, String state) {
        double tax = 0;
        if (state.equals("WI")) {
            tax = amount * 0.055;
        }
        return tax;
    }

}
