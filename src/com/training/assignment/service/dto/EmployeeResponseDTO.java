package com.training.assignment.service.dto;

import com.training.assignment.repository.entity.EmployeeEntity;

public class EmployeeResponseDTO {
    private final String name;
    private final int salary;
    private final int uniqueIdentifier;
    private final int age;

    public EmployeeResponseDTO(EmployeeEntity employeeEntity) {
        this.name = employeeEntity.getName();
        this.salary = employeeEntity.getSalary();
        this.uniqueIdentifier = employeeEntity.getUniqueIdentifier();
        this.age = employeeEntity.getAge();
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    public int getAge() {
        return age;
    }


}
