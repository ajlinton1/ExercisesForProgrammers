package com.andrewlinton.simpleMath;

import java.util.Scanner;

public class SimpleMath {

    public static void main(String[] args) {
        System.out.print("What is the first number?");
        int first = getInt();
        System.out.println("What is the second number");
        int second = getInt();

        int sum = first + second;
        int difference = first - second;
        int product = first * second;
        int quotient = first / second;

        String output = first + " + " + second + " = " + sum;
        output = output + "\n\r";

        output = output + first + " - " + second + " = " + difference;
        output = output + "\n\r";

        output = output + first + " * " + second + " = " + product;
        output = output + "\n\r";

        output = output + first + " / " + second + " = " + quotient;
        output = output + "\n\r";

        System.out.println(output);
    }

    static int getInt() {
        int ret = 0;
        Scanner in = new Scanner(System.in);

        for (;;) {
            try {
                String line = in.nextLine();
                ret = Integer.parseInt(line);
                break;
            } catch (Exception ex) {
                System.out.println("Invalid input");
            }
        }

        return ret;
    }


}
