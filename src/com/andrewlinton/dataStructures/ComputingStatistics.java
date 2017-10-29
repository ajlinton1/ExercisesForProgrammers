package com.andrewlinton.dataStructures;

import com.andrewlinton.InputService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.*;

public class ComputingStatistics {

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        Integer min = Integer.MAX_VALUE;
        Integer max = Integer.MIN_VALUE;
        Integer sum = 0;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Enter value ");
            String line = in.nextLine();
            if (line.equals("done")) {
                break;
            }
            Integer value = Integer.parseInt(line);
            values.add(value);
            if (value>max) {
                max = value;
            }
            if (value<min) {
                min = value;
            }
            sum = sum + value;
        }
        double mean = sum/values.size();

        double differenceFromMeanSqrSum = 0;

        for (Integer i:values) {
            differenceFromMeanSqrSum += Math.pow(i-mean,2);
        }
        double std = Math.sqrt(differenceFromMeanSqrSum/values.size());

        System.out.printf("Average: %f \n\r", mean);
        System.out.printf("Max: %d \n\r", max);
        System.out.printf("Min: %d \n\r", min);
        System.out.printf("Std: %f \n\r", std);
    }

    public static void streamProcessing() {
        List<Integer> values = new ArrayList<>();
        values.add(100);
        values.add(200);
        values.add(1000);
        values.add(300);

        Optional<Integer> min = values.stream().reduce(Integer::min);
        Optional<Integer> max = values.stream().reduce(Integer::max);
        Integer sum = values.stream().reduce(0,(a,b)->a+b);
        double mean = sum/values.size();

        double dd = values.stream().mapToDouble(i->i).reduce(0,(a,b)->a + Math.pow(b-mean,2));
        double std = Math.sqrt(dd/values.size());
        System.out.println("");
    }

}
