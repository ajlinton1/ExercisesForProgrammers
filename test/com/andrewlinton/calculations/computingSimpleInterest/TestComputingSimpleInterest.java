package com.andrewlinton.calculations.computingSimpleInterest;

import org.junit.*;

public class TestComputingSimpleInterest {

    @Test
    public void testCompute() {
        double principal = 1500;
        double rate = 4.3;
        double years = 4;

        double expected = 1758;

        double result = ComputingSimpleInterest.compute(principal, rate, years);

        Assert.assertEquals(expected, result, 0.001);
    }


}
