package com.andrewlinton.makingDecisions;

public class PasswordValidation {

    public static void main(String[] args) {
        final String password = "outtask";
        System.out.println("Enter password: ");
        String input = InputHelper.getString();
        if (input.equals(password)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong");
        }
    }

}
