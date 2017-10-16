package com.andrewlinton.makingDecisions;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class ComparingNumbers {

    public static void main(String[] args) {
        final int maxNumbers = 3;
        Collection<Integer> numbers = new HashSet<>();
        int max = Integer.MIN_VALUE;

        for (int i=0;i<maxNumbers;i++) {
            System.out.println("Input number: ");
            int number = InputHelper.getInt();
            Integer numberInteger = new Integer(number);
            if (numbers.contains(numberInteger)) {
                System.out.println("Duplicate number");
                return;
            }
            numbers.add(numberInteger);
            if (number>max) {
                max = number;
            }
        }
        System.out.printf("Max value: %d", max);
    }

}
