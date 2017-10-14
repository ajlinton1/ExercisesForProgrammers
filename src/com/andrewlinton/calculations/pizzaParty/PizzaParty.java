package com.andrewlinton.calculations.pizzaParty;

import java.util.Scanner;

public class PizzaParty {

    public static void main(String[] args) {
        System.out.print("How many people? ");
        int people = getInt();
        System.out.print("How many pizzas do you have? ");
        int pizzas = getInt();
        System.out.print("How many slices per pizza ");
        int slicesPerPizza = getInt();
        int totalSlices = pizzas * slicesPerPizza;
        int slicesPerPerson = totalSlices/people;
        int leftOver = totalSlices - (slicesPerPerson * people);
        System.out.println();
        System.out.printf("%d people with %d pizza", people, pizzas);
        System.out.println();
        System.out.printf("Each person gets %d pieces of pizza", slicesPerPerson);
        System.out.println();
        System.out.printf("There are %d leftover pieces", leftOver);
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
