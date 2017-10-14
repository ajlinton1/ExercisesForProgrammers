package com.andrewlinton.madLib;

import java.util.Scanner;

public class MadLib {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a noun ");
        String noun = in.nextLine();
        System.out.print("Enter a verb ");
        String verb = in.nextLine();
        System.out.print("Enter an adjective ");
        String adjective = in.nextLine();
        System.out.print("Enter an adverb ");
        String adverb = in.nextLine();
        System.out.println();
        System.out.printf("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);
    }

}
