package com.andrewlinton.dataStructures;

import org.junit.*;

import java.util.List;

public class TestFilteringValues {

    @Test
    public void getEvenValues(){
        String input = "1 2 3 50 45 24 65";
        List<Integer> all = FilteringValues.getNumbers(input);
        List<Integer> even = FilteringValues.getEven(all);
        Assert.assertNotNull(even);
    }

    @Test
    public void parseInput() {
        String input = "1 2 3 45 65";
        List<Integer> result = FilteringValues.getNumbers(input);
        Assert.assertNotNull(result);
    }
}
