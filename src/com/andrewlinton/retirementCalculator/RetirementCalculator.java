package com.andrewlinton.retirementCalculator;

import java.util.Scanner;
import java.time.*;

public class RetirementCalculator {

    public static void main(String[] args) {
        System.out.print("What is your current age? ");
        int currentAge = getInt();
        int currentYear = LocalDate.now().getYear();
        int yearsTillRetirement = 65 - currentAge;
        if (yearsTillRetirement<1) {
            System.out.println("You can retire now");
            return;
        }
        System.out.printf("You have %d years till retirement", yearsTillRetirement);
        System.out.println();
        int retirementYear = currentYear + yearsTillRetirement;
        System.out.printf("You can retire in %d", retirementYear);
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
