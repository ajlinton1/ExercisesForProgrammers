package com.andrewlinton.dataStructures;

import org.junit.*;

import java.util.List;
import java.util.Map;

public class TestFilteringRecords {

    @Test
    public void filterRecords() {
        FilteringRecords filteringRecords = new FilteringRecords();
        List<Map<String,String>> filtered = filteringRecords.getEmployees("Jac");
        Assert.assertNotNull(filtered);

    }
}
