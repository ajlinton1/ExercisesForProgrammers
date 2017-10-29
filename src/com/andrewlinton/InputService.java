package com.andrewlinton;

import java.util.Scanner;

public class InputService {

    public static double getDouble() {
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

    public static double getDouble(double min) {
        while (true) {
            double ret = getDouble();
            if (ret>min) {
                return ret;
            } else {
                System.out.println("Value too small");
            }
        }
    }

    public static int getInt() {
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

    public static String getString() {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        return line;
    }

    public static String getString(int minLength) {
        for (;;) {
            String ret = getString();
            if (ret.length()>=minLength) {
                return ret;
            } else {
                System.out.println("Input too short");
            }
        }
    }

    public static String getString(String pattern) {
        for (;;) {
            String ret = getString();
            if (ret.matches(pattern)) {
                return ret;
            } else {
                System.out.println("Invalid format");
            }
        }
    }

}
