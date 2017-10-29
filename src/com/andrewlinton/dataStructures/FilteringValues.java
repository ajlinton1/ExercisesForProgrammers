package com.andrewlinton.dataStructures;

import com.andrewlinton.InputService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringValues {

    public static void main(String[] args) {
        System.out.print("Enter list of numbers: ");
        String input = InputService.getString();

        List<Integer> numbers = getNumbers(input);
        List<Integer> even = getEven(numbers);
        System.out.println();
    }

    public static boolean isEven(Integer i){
        double a = i/2.0;
        double b = Math.round(i/2.0);
        return (a==b);
    }

    public static List<Integer> getEven(List<Integer> numbers) {
        List<Integer> even = numbers.stream().filter(i->isEven(i)).collect(Collectors.toList());
        return even;
    }

    public static List<Integer> getNumbers(String input) {
        List<Integer> numbers = new ArrayList<Integer>();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<input.length();i++) {
            char c = input.charAt(i);
            if (c==' ') {
                Integer v = new Integer(sb.toString());
                numbers.add(v);
                sb = new StringBuilder();
            } else {
                sb.append(c);
            }
        }
        if (sb.length()>0) {
            Integer v = new Integer(sb.toString());
            numbers.add(v);
        }

        return numbers;
    }

}
