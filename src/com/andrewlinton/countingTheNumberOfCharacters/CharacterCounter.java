package com.andrewlinton.countingTheNumberOfCharacters;

import java.util.Scanner;

public class CharacterCounter {

    public static void main(String[] args) {
        System.out.println("What is the input string?");
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        int count = line.length();
        System.out.printf("%s has %d characters", line, count);
    }

}
