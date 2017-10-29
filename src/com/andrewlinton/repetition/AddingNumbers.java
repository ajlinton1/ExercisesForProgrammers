package com.andrewlinton.repetition;

import com.andrewlinton.InputService;

public class AddingNumbers {

    public static void main(String[] args) {
        int num = 5;
        int sum = 0;
        for (int i=0;i<num;i++) {
            System.out.print("Enter number: ");
            int x = InputService.getInt();
            sum = sum + x;
        }
        System.out.printf("Sum: %d", sum);
    }

}
