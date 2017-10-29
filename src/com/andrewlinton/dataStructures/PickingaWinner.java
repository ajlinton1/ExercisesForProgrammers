package com.andrewlinton.dataStructures;

import com.andrewlinton.InputService;

import java.util.ArrayList;
import java.util.List;

public class PickingaWinner {

    public static void main(String[] args) {
        List<String> people = new ArrayList<String>();
        String input = null;
        do {
            System.out.print("Enter name: ");
            input = InputService.getString();
            if (input.length()>0) {
                people.add(input);
            }
        } while (input.length()>0);

        int choice = (int) Math.round(Math.random() * people.size());
        String winner = people.get(choice);
        System.out.println();
        System.out.printf("The winner is %s", winner);
    }

}
