package com.andrewlinton.makingDecisions;

public class BMICalculator {

    public static void main(String[] args) {
        System.out.print("Enter height: ");
        double height = InputHelper.getDouble();
        System.out.print("Enter weight: ");
        double weight = InputHelper.getDouble();
        double bmi = (weight / (height*height)) * 703;
        if (bmi < 18.5) {
            System.out.println("You are underweight");
        } else if (bmi > 25) {
            System.out.println("You are overweight");
        } else {
            System.out.println("You are within ideal weight range");
        }
    }

}
