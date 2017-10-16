package com.andrewlinton.makingDecisions;

public class LegalDrivingAge {

    public static void main(String[] args){
        final int legalAge = 16;
        System.out.println("Enter your age: ");
        int age = InputHelper.getInt();

        String message = (age<legalAge) ? "Not old enough" : "Old enough";
        System.out.println(message);
    }

}
