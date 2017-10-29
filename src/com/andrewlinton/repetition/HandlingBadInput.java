package com.andrewlinton.repetition;

import com.andrewlinton.InputService;

public class HandlingBadInput {

    public static void main(String[] args) {
        System.out.print("Enter rate: ");
        double rate = InputService.getDouble(0);
        long years = Math.round(72/rate);
        System.out.printf("Number of years required %d", years);
    }
}
