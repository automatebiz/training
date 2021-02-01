package com.training.assignment.service;

import com.training.assignment.model.Employee;
import com.training.assignment.repository.EmployeeRepository;

import java.util.List;

public class EmployeeService {

    private EmployeeRepository employeeRepository = new EmployeeRepository();

    public int createEmployee(String name, int age, int salary) {
        final int uniqueIdentifier = EmployeeIDGenerator.generateID();
        Employee employee = new Employee(name, salary, uniqueIdentifier, age);
        employeeRepository.save(employee);
        return uniqueIdentifier;
    }

    public Employee updateEmployee(int employeeId, String name, int age, int salary) {
        Employee employee = employeeRepository.retrieve(employeeId);
        employee.update(name, age, salary);
        employeeRepository.save(employee);
        return employeeRepository.retrieve(employeeId);
    }

    public void deleteEmployee(int employeeId) {
        employeeRepository.delete(employeeId);
    }

    public List<Employee> listEmployees() {
        // Fetch all employees from repository
        return employeeRepository.fetchAll();
    }

}
