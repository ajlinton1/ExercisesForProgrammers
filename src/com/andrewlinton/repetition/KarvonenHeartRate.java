package com.andrewlinton.repetition;

import com.andrewlinton.InputService;

public class KarvonenHeartRate {

    public static void main(String[] args) {

        System.out.print("Enter age: ");
        int age = InputService.getInt();
        System.out.print("Enter resting heart rate: ");
        int restingHeartRate = InputService.getInt();

        for (int intensity = 55;intensity<=95;intensity=intensity+5) {
            double targetHeartRate = (((220-age)-restingHeartRate)*intensity) + restingHeartRate;
            System.out.printf("Intensity: %d, Rate: %f \n\r", intensity, targetHeartRate);
        }
    }

}
