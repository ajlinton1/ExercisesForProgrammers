package com.andrewlinton.printingQuotes;

import java.util.Scanner;

public class QuotePrinter {

    public static void main(String[] args) {
        System.out.print("What is the quote?");
        Scanner in = new Scanner(System.in);
        String quote = in.nextLine();
        System.out.print("Who said it");
        String author = in.nextLine();
        String output = author + " said " + "\"" + quote + "\"";
        System.out.println();
        System.out.println(output);
    }


}
