package com.kgisl.qs1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;
 
public class Emp {
 
    public static void main(String a[]) {
 
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee("Nataraja G", "101", 8000));
        empList.add(new Employee("Nagesh Y", "102", 15000));
        empList.add(new Employee("Vasu V", "103", 2500));
        empList.add(new Employee("Amar", "104", 12500));
        //  empList.stream().collect(Collectors.toSet());
        //  empList.stream().sorted();
        List<Object> show = empList.stream().sorted().collect(Collectors.toList());
        System.out.println(show);
        //  System.out.println(empList);
    }
}