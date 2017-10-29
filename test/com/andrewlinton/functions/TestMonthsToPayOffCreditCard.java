package com.andrewlinton.functions;

import org.junit.*;

public class TestMonthsToPayOffCreditCard {

    @Test
    public void testMonthsToPayOffCreditCard() {
        double balance = 5000;
        double rate = 12;
        double payment = 100;
        int result = MonthsToPayOffCreditCard.getMonthsToPayOffCreditCard(balance, payment, rate);
        Assert.assertEquals(70, result);
    }
}
