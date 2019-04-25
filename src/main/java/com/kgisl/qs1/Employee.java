package com.kgisl.qs1;

import java.util.stream.Collector;

public class Employee {

    public static Collector<? super Employee, Object, Object> collector;
    private String name;
    private Integer id;
    private Integer salary;

    public Employee(String name,Integer id, Integer salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

	public Employee(String name2, String string, int salary2) {
	}
	public String toString() {

        return "name: " + this.name + " | id: " + this.id + " | salary: " + this.salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}

