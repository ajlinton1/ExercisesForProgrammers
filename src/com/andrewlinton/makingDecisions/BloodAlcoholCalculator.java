package com.andrewlinton.makingDecisions;

public class BloodAlcoholCalculator {

    public static void main(String[] args) {
        System.out.println("Enter alcohol drunk: ");
        double alcohol = InputHelper.getDouble();
        System.out.println("Enter weight: ");
        double weight = InputHelper.getDouble();
        System.out.println("Enter gender: ");
        String gender = InputHelper.getString();
        System.out.println("Hours since last drink: ");
        double hours = InputHelper.getDouble();
        String message = BloodAlcoholCalculator.isLegal(alcohol, weight, gender, hours) ? "legal" : "not legal";
        System.out.println("You are " + message + " to drive");
    }

    public static boolean isLegal(double alcohol, double weight, String gender, double hours) throws IllegalArgumentException
    {
        final double max = 0.08;
        boolean ret = true;

        double ratio = 0;
        if (gender.equals("M")) {
            ratio = 0.74;
        } else if (gender.equals("W")) {
            ratio = 0.66;
        } else {
            throw new IllegalArgumentException();
        }

        double bac = (alcohol * 5.14/weight * ratio) - (0.015 * hours);
        ret = (bac < max) ? true : false;
        return ret;
    }

}
