package com.andrewlinton.dataStructures;

import com.andrewlinton.InputService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListRemoval {

    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

        while (!employees.isEmpty()) {
            for(String employee:employees) {
                System.out.println(employee);
            }
            System.out.println();
            System.out.print("Enter employee to delete: ");
            String employeeToDelete = InputService.getString();
            int i = employees.indexOf(employeeToDelete);
            if (i>-1) {
                employees.remove(i);
            } else {
                System.out.println("Not found");
            }
        }
    }

}


