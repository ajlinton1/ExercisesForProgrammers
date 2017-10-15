package com.andrewlinton.calculations.currencyConversion;

import java.util.Scanner;

public class CurrencyConversion {

    public static void main(String[] args) {
        System.out.print("How many euros are you exchanging? ");
        double amountFrom = getDouble();
        System.out.println("What is the exchange rate? ");
        double exchangeRate = getDouble();
        double amountTo = convert(amountFrom, exchangeRate);
        System.out.printf("%.2f at an exchange rate of %.2f is %.2f dollars", amountFrom, exchangeRate, amountTo);

    }

    static double convert(double amountFrom, double rateFrom) {
        double rateTo = 100;
        double ret = (amountFrom*rateFrom)/rateTo;
        ret = ret * 100;
        ret = Math.round(ret);
        ret = ret/100;
        return ret;
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

    static double getDouble() {
        double ret = 0;
        Scanner in = new Scanner(System.in);

        for (;;) {
            try {
                String line = in.nextLine();
                ret = Double.parseDouble(line);
                break;
            } catch (Exception ex) {
                System.out.println("Invalid input");
            }
        }

        return ret;
    }

}

