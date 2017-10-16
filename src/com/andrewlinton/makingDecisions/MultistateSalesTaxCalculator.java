package com.andrewlinton.makingDecisions;

import java.util.HashMap;

public class MultistateSalesTaxCalculator {

    class TaxRate {
        public double stateRate;
        public HashMap<String,Double> countyRates = new HashMap<>();
    }

    HashMap<String,TaxRate> taxRates = new HashMap<>();

    public MultistateSalesTaxCalculator() {
        TaxRate wisconsin = new TaxRate();
        wisconsin.stateRate = 0.05;
        wisconsin.countyRates.put("Eau Claire",0.005 );
        wisconsin.countyRates.put("Dunn",0.004 );
        taxRates.put("Wisconsin",wisconsin);

        TaxRate illinois = new TaxRate();
        illinois.stateRate = .08;
        taxRates.put("Illinois",illinois);
    }

    public static void main(String[] args) {
        MultistateSalesTaxCalculator multistateSalesTaxCalculator = new MultistateSalesTaxCalculator();
    }

    public double calculate(double gross, String state, String county) {
        double totalTax = 0;

        TaxRate taxRate = taxRates.get(state);
        if (taxRate!=null) {
            Double countyRate = taxRate.countyRates.get(county);
            if (countyRate!=null) {
                totalTax = countyRate.doubleValue()*gross;
            }
            totalTax = totalTax + (taxRate.stateRate * gross);
        }

        return totalTax;
    }
}
