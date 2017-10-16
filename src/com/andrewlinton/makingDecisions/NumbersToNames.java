package com.andrewlinton.makingDecisions;

import java.util.HashMap;

public class NumbersToNames {

    public static void main(String[] args) {

        HashMap<String,String> months = new HashMap<>();
        months.put("1","January");
        months.put("2","February");
        months.put("3","March");
        months.put("4","April");
        months.put("5","May");
        months.put("6","June");
        months.put("7","July");
        months.put("8","Augest");
        months.put("9","September");
        months.put("10","October");
        months.put("11","November");
        months.put("12","December");

        System.out.print("Enter number of the month");
        String number = InputHelper.getString();
        String monthName = months.get(number);
        System.out.printf("Month: %s", monthName);

    }

}
