package com.training.assignment.model;

import org.apache.commons.lang3.StringUtils;

/**
 * Employee: The pojo which defines the properties and behavior of the employee.
 */
public class Employee {
    private final String name;
    private final int salary;
    private final int age;

    public Employee(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public void displayInformation() {
        System.out.println(this.name + ", " + this.age + ", " + this.salary);
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return
                "name='" + name + ", salary=" + salary + ", age=" + age;

    }

    public boolean isDataValid() {
        boolean isValid = true;
        if (age < 0) {
            System.out.println("Age not valid");
            isValid = false;
        }
        if (StringUtils.isBlank(name)) {
            System.out.println("name is not valid");
            isValid = false;
        }
        if (salary < 0) {
            System.out.println("Salary is not valid");
            isValid = false;
        }

        return isValid;
    }
}
