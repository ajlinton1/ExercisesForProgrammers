package com.andrewlinton.functions;

import com.andrewlinton.InputService;

public class MonthsToPayOffCreditCard {

    public static void main(String[] args) {
        System.out.print("Enter balance: ");
        double balance = InputService.getDouble();
        System.out.print("Enter payment: ");
        double payment = InputService.getDouble();
        System.out.print("Enter rate: ");
        double rate = InputService.getDouble();
        int months = getMonthsToPayOffCreditCard(balance, payment, rate);
        System.out.printf("Months required %d", months);
    }

    public static int getMonthsToPayOffCreditCard(double b, double p, double rate) {
        int ret = 0;
        rate = rate/100;
        double i = rate/365;

        double x = Math.pow(1+i,30);
        double y = Math.log(1+i);
        double r1 = (-1.0)*(1.0/30.0);

        double ret2 = r1*(Math.log(1 + (b/p)*(1.0-x)))/y;
        ret2 = Math.ceil(ret2);
        ret = (int)ret2;

        return ret;
    }


}
