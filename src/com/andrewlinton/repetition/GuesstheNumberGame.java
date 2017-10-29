package com.andrewlinton.repetition;

import com.andrewlinton.InputService;

public class GuesstheNumberGame {

    public static void main(String[] args){
        System.out.println("Enter difficulty: ");
        int difficulty = InputService.getInt();
        long range = (long)(Math.pow(10,difficulty));
        long target = Math.round(Math.random()*range);
        while (true) {
            System.out.print("Enter guess: ");
            int guess = InputService.getInt();
            if (guess == target) {
                System.out.println("You win");
                return;
            }
            if (guess>target) {
                System.out.println("Too high");
            } else {
                System.out.println("Too low");
            }
        }
    }

}
