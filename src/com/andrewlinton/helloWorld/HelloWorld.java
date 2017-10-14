package com.andrewlinton.helloWorld;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner in = new Scanner(System.in);
        System.out.println("Hello " + in.nextLine());
    }

}
