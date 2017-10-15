package com.andrewlinton.calculations.currencyConversion;

import org.junit.*;

public class TestCurrencyConversion {

    @Test
    public void testConvert() {
        double expected = 111.38;
        double amountFrom = 81;
        double rateFrom = 137.51;
        double amountTo = CurrencyConversion.convert(amountFrom, rateFrom);

        Assert.assertEquals(expected, amountTo, 0.001);
    }

}
