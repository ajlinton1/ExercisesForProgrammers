package com.andrewlinton.com.andrewlinton.makingDecisions;

import com.andrewlinton.makingDecisions.BloodAlcoholCalculator;
import org.junit.*;

public class TestBloodAlcoholCalculator {

    @Test
    public void testIsLegal() {
        boolean expected = true;
        double alcohol = 1;
        double weight = 200;
        String gender = "M";
        double hours = 24;
        boolean result = BloodAlcoholCalculator.isLegal(alcohol, weight, gender, hours);
        Assert.assertEquals(expected, result);
    }

}
