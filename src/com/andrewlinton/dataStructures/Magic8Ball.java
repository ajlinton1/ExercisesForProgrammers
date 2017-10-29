package com.andrewlinton.dataStructures;

import com.andrewlinton.InputService;

public class Magic8Ball {

   public static void main(String[] args) {

       String[] answers = {"Yes","No","Maybe","Ask again later"};

       System.out.print("Enter question: ");
       String question = InputService.getString();
       int choice = (int)Math.round(Math.random() * answers.length);
       String answer = answers[choice];
       System.out.println(answer);
  }

}
