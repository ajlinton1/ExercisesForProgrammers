package com.andrewlinton.com.andrewlinton.makingDecisions;

import com.andrewlinton.makingDecisions.MultistateSalesTaxCalculator;
import org.junit.*;

public class TestMultistateSalesTaxCalculator {

    @Test
    public void testCalculate() {
        double expected = 10.55;
        String state = "Wisconsin";
        String county = "Eau Claire";
        double gross = 10;

        MultistateSalesTaxCalculator multistateSalesTaxCalculator = new MultistateSalesTaxCalculator();
        double result = multistateSalesTaxCalculator.calculate(gross, state, county) + gross;
        Assert.assertEquals(expected, result, 0.001);
    }

    @Test
    public void testCalculate1() {
        double expected = 10.54;
        String state = "Wisconsin";
        String county = "Dunn";
        double gross = 10;

        MultistateSalesTaxCalculator multistateSalesTaxCalculator = new MultistateSalesTaxCalculator();
        double result = multistateSalesTaxCalculator.calculate(gross, state, county) + gross;
        Assert.assertEquals(expected, result, 0.001);
    }

    @Test
    public void testCalculate2() {
        double expected = 10.80;
        String state = "Illinois";
        String county = null;
        double gross = 10;

        MultistateSalesTaxCalculator multistateSalesTaxCalculator = new MultistateSalesTaxCalculator();
        double result = multistateSalesTaxCalculator.calculate(gross, state, county) + gross;
        Assert.assertEquals(expected, result, 0.001);
    }

    @Test
    public void testCalculate3() {
        double expected = 10.00;
        String state = "Washington";
        String county = null;
        double gross = 10;

        MultistateSalesTaxCalculator multistateSalesTaxCalculator = new MultistateSalesTaxCalculator();
        double result = multistateSalesTaxCalculator.calculate(gross, state, county) + gross;
        Assert.assertEquals(expected, result, 0.001);
    }

}
