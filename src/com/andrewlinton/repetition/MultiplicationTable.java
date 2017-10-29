package com.andrewlinton.repetition;

public class MultiplicationTable {

    public static void main(String[] args) {
        for (int x = 1;x <=12; x++) {
            for (int y = 1;y <= 12;y++) {
                int z = x * y;
                System.out.printf("%d * %d = %d \n\r",x,y,z);
            }
        }
    }
}
