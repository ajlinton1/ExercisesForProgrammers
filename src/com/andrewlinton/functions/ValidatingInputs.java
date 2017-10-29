package com.andrewlinton.functions;

import com.andrewlinton.InputService;

public class ValidatingInputs {

    public static void main(String[] args) {
        System.out.print("Enter first name: ");
        String firstName = InputService.getString(2);
        System.out.print("Enter last name");
        String lastName = InputService.getString(2);
        System.out.print("Enter employee id");
        String employeeId = InputService.getString("[a-zA-Z]{2}-[0-9]{4}");

    }

}
