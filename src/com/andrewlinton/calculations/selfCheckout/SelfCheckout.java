package com.andrewlinton.calculations.selfCheckout;

import java.util.Scanner;

public class SelfCheckout {

    public static void main(String[] args) {
        final int maxItems = 3;
        final double taxRate = .055;
        double gross = 0;
        for (int i=0;i<maxItems;i++) {
            System.out.printf("Enter the price of item %d: ", i);
            double price = getInt();
            System.out.printf("Enter the quanity of item %d: ", i);
            int quality = getInt();
            gross = gross + (price * quality);
        }
        double tax = gross * taxRate;
        double taxD = Math.round(tax * 100);
        double taxD1 = taxD/100;
        double total = gross + taxD1;
        System.out.printf("Subtotal: %.2f", gross);
        System.out.println();
        System.out.printf("Tax: %.2f", taxD1);
        System.out.println();
        System.out.printf("Total: %.2f", total);
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


}
