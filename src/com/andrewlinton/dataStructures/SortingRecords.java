package com.andrewlinton.dataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortingRecords {

    List<Map<String,String>> employees = new ArrayList<Map<String,String>>();

    public SortingRecords() {
        Map<String,String> employee = new HashMap<>();
        employee.put("FirstName","John");
        employee.put("LastName","Johnson");
        employee.put("Title","Manager");
        employee.put("SeparationDate","2016-12-31");
        employees.add(employee);

        employee = new HashMap<>();
        employee.put("FirstName","Tou");
        employee.put("LastName","Xiong");
        employee.put("Title","Software Engineer");
        employee.put("SeparationDate","2016-10-05");
        employees.add(employee);

        employee = new HashMap<>();
        employee.put("FirstName","Michaela");
        employee.put("LastName","Michaelson");
        employee.put("Title","District Manager");
        employee.put("SeparationDate","2015-12-19");
        employees.add(employee);

        employee = new HashMap<>();
        employee.put("FirstName","Jake");
        employee.put("LastName","Jacobson");
        employee.put("Title","Programmer");
        employees.add(employee);

        employee = new HashMap<>();
        employee.put("FirstName","Jacquelyn");
        employee.put("LastName","Jackson");
        employee.put("Title","DBA");
        employees.add(employee);

        employee = new HashMap<>();
        employee.put("FirstName","Sally");
        employee.put("LastName","Weber");
        employee.put("Title","Web Developer");
        employee.put("SeparationDate","2015-12-18");
        employees.add(employee);
    }

    public List<Map<String,String>> getEmployees() {
        List<Map<String,String>> sorted = new ArrayList<Map<String,String>>();
        String lastInserted = "";

        for (int x=0;x<employees.size();x++) {
            int selectedIndex = -1;
            String lastValue = null;
            for (int y=0;y<employees.size();y++) {
                String currentName = employees.get(y).get("LastName");
                if ((currentName.compareTo(lastInserted)>0) && ((lastValue==null) || (employees.get(y).get("LastName").compareTo(lastValue)<0))){
                    lastValue = employees.get(y).get("LastName");
                    selectedIndex = y;
                }
            }
            sorted.add(employees.get(selectedIndex));
            lastInserted = employees.get(selectedIndex).get("LastName");
        }

        return sorted;
    }
}
