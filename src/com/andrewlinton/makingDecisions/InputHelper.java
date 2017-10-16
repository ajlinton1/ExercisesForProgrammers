package com.andrewlinton.makingDecisions;

import java.util.Scanner;

public class InputHelper {

    static double getDouble() {
        double ret = 0;
        Scanner in = new Scanner(System.in);

        for (;;) {
            try {
                String line = in.nextLine();
                ret = Double.parseDouble(line);
                break;
            } catch (Exception ex) {
                System.out.println("Invalid input");
            }
        }

        return ret;
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

    static String getString() {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        return line;
    }

}
