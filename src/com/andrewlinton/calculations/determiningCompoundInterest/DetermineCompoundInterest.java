package com.andrewlinton.calculations.determiningCompoundInterest;

import java.util.Scanner;

public class DetermineCompoundInterest {

    public static void main(String[] args){
        System.out.print("What is the principal amount? ");
        double principal = getDouble();
        System.out.print("What is the rate? ");
        double rate = getDouble();
        System.out.print("What are the number of years? ");
        double years = getDouble();
        System.out.print("How may times is it compounded ");
        double compounded = getDouble();

        double amount = compute(principal, rate, years, compounded);
        System.out.printf("Final amount is: %.2f", amount);
    }

    public static double compute(double principal, double rate, double years, double compounded) {
        rate = rate/100;
        double ret = principal * Math.pow(1 + (rate/compounded),years * compounded);
        ret = ret * 100;
        ret = Math.round(ret);
        ret = ret / 100;
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
