package com.andrewlinton.tips;

import org.junit.*;

public class TipCalculatorTest {

    @Test
    public void testCalculate() {
        double expected = 1.5;
        TipCalculator tipCalculator = new TipCalculator();
        double gross = 10.00;
        int tipPercentage = 15;
        double tip = tipCalculator.calculateTip(gross, tipPercentage);
        System.out.println(tip);
        Assert.assertEquals(expected, tip, .1);
    }

    @Test
    public void testProcess() {
        TipCalculator tipCalculator = new TipCalculator();
        tipCalculator.process();
    }


}
