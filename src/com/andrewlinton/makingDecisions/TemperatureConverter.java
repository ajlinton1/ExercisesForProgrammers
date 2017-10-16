package com.andrewlinton.makingDecisions;

import java.util.function.*;

public class TemperatureConverter {

    public static void main(String[] args) {

        Function<DoubleWrapper,DoubleWrapper> fToC = (DoubleWrapper fahrenheit) -> {
            double c = ((fahrenheit.value - 32) * 5 / 9);
            DoubleWrapper cWrapper = new DoubleWrapper(c);
            return cWrapper;
        };

        Function<DoubleWrapper,DoubleWrapper> cToF = (DoubleWrapper celsius) -> {
            double f = (celsius.value * 9 / 5) + 32;
            DoubleWrapper fWrapper = new DoubleWrapper(f);
            return fWrapper;
        };

        Function<DoubleWrapper,DoubleWrapper> converter;
        TempConvert tempConvert;
        String source, target;
        double ratio;
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        String choice = InputHelper.getString();
        if (choice.equals("C")) {
            source = "Fahrenheit";
            target = "Celsius";
            converter = fToC;
        } else if (choice.equals("F")) {
            source = "Celsius";
            target = "Fahrenheit";
            converter = cToF;
        } else {
            throw new IllegalArgumentException();
        }

        double tempSource = getSource(source);

        DoubleWrapper sourceWrapper = new DoubleWrapper(tempSource);
        DoubleWrapper targetWrapper = converter.apply(sourceWrapper);
        System.out.printf("The temperature in %s is %.0f", target, targetWrapper.value);
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return ((fahrenheit - 32) * 5 / 9);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double getSource(String sourceName) {
        System.out.printf("Please enter the temperature in %s ", sourceName);
        double tempSource = InputHelper.getDouble();
        return tempSource;
    }

    interface TempConvert{
        double convert(double source);
    }

    public static void convertAndDisplay(TempConvert tempConvert, double sourceTemp, String targetName) {
        double targetTemp = tempConvert.convert(sourceTemp);
        System.out.printf("The temperature in %s is %.0f", targetName, targetTemp);
    }

/*    public static <Double> Function<Double,Double> fahrenheitToCelsius1(Double fahrenheit) {
        double f = (double)fahrenheit;
        double c = ((f - 32) * 5 / 9);
        Double celsius = null;
        return celsius;
    } */

}
