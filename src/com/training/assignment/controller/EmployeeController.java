package com.training.assignment.controller;

import com.training.assignment.framework.Menu;
import com.training.assignment.model.Employee;
import com.training.assignment.service.EmployeeService;

import java.util.List;

/**
 * Controller only handles the incoming requests.
 */
public final class EmployeeController {

    private EmployeeService employeeService = new EmployeeService();
    // handle incoming employee related requests based on user choice

    public int createEmployee(final String name, final int age, final int salary) {
        // Whether the data provides is valid.
        if (isDataValid(name, age, salary))
            return employeeService.createEmployee(name, age, salary);

        return -1; // employee creation is failed.
    }

    private boolean isDataValid(String name, int age, int salary) {
        boolean isValid = true;
        if (age < 0) {
            System.out.println("Age not valid");
            isValid = false;
        }
        if (name == null || name.equals("")) {
            System.out.println("name is not valid");
            isValid = false;
        }
        if (salary < 0) {
            System.out.println("Salary is not valid");
            isValid = false;
        }

        return isValid;
    }

    public void updateEmployee(int employeeId,
                               final String name, final int age, final int salary) {
        if (employeeId < 0)
            throw new RuntimeException("Invalid employee Id");

        employeeService.updateEmployee(employeeId, name, age, salary);

    }

    public void deleteEmployee(int employeeId) {
        employeeService.deleteEmployee(1);
    }

    public List<Employee> listEmployee() {
        return employeeService.listEmployees();
    }

}
