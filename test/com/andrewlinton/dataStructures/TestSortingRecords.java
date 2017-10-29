package com.andrewlinton.dataStructures;

import org.junit.*;

import java.util.List;
import java.util.Map;

public class TestSortingRecords {

    @Test
    public void getEmployees() {
        SortingRecords sortingRecords = new SortingRecords();
        List<Map<String,String>> employees = sortingRecords.getEmployees();
        Assert.assertNotNull(employees);
    }

}
