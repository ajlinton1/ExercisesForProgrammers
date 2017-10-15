package com.andrewlinton.calculations.com.andrewlinton.calculations.determiningCompoundInterest;

import com.andrewlinton.calculations.determiningCompoundInterest.DetermineCompoundInterest;
import org.junit.*;

public class TestDetermineCompoundInterest {

    @Test
    public void testCompute() {
        double expected = 1938.84;
        double principal = 1500;
        double rate = 4.3;
        double years = 6;
        double compounded = 4;

        double result = DetermineCompoundInterest.compute(principal, rate, years, compounded);
        Assert.assertEquals(expected, result, .001);
    }

}
