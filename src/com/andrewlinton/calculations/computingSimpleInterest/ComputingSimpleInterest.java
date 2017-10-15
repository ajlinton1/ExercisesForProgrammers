package com.andrewlinton.calculations.computingSimpleInterest;

import java.util.Scanner;

public class ComputingSimpleInterest {

    public static void main(String[] args) {

    }

    public static double compute(double principal, double rate, double years) {
        rate = rate / 100;
        double ret = principal * (1 + (rate * years));
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
