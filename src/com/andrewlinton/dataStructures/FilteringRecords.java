package com.andrewlinton.dataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilteringRecords {

    List<Map<String,String>> employees = new ArrayList<Map<String,String>>();

    public FilteringRecords() {
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

    boolean filterEmployee(Map<String,String> employee,String criteria) {
        if (employee.get("FirstName").contains(criteria)) {
            return true;
        }
        if (employee.get("LastName").contains(criteria)) {
            return true;
        }
        return false;
    }

    public List<Map<String,String>> getEmployees(String criteria) {
        List<Map<String,String>> filtered = employees.stream().filter(e-> {return filterEmployee(e,criteria);}).collect(Collectors.toList());

        return filtered;
    }

}
