package com.training.assignment.model;

/**
 * Employee: The pojo which defines the properties and behavior of the employee.
 */
public class Employee {
    private String name;
    private int salary;
    private int uniqueIdentifier;
    private int age;

    public Employee(String name, int salary, int uniqueIdentifier, int age) {
        this.name = name;
        this.salary = salary;
        this.uniqueIdentifier = uniqueIdentifier;
        this.age = age;
    }

    public void displayInformation() {
        System.out.println(this.name + ", " + this.age + ", " + this.salary
                + ", " + this.uniqueIdentifier);
    }

    public int getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    public void update(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }
}
