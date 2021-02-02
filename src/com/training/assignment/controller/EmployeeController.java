package com.training.assignment.controller;

import com.training.assignment.model.Employee;
import com.training.assignment.model.Response;
import com.training.assignment.service.EmployeeService;

import java.util.List;

/**
 * Controller only handles the incoming requests.
 */

public final class EmployeeController {

    private EmployeeService employeeService = new EmployeeService();
    // handle incoming employee related requests based on user choice

    public Response createEmployee(final String name, final int age, final int salary) {
        // Whether the data provides is valid.
        if (isDataValid(name, age, salary)) {
            final int employeeIdentifier = employeeService.createEmployee(name, age, salary);

            final Response<Integer> response = new Response("Employee created successfully!", true);
            response.setData(employeeIdentifier);
            return response;
        }
        return new Response("Employee creation failed, due to invalid data", false);
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

    public Response<Employee> updateEmployee(int employeeId,
                                   final String name, final int age, final int salary) {
        if (employeeId < 0)
            throw new RuntimeException("Invalid employee Id");

        final Employee employee = employeeService.updateEmployee(employeeId, name, age, salary);

        Response<Employee> response = new Response("Employee update has been successful!", true);
        response.setData(employee);
        return response;

    }

    public Response<Boolean> deleteEmployee(int employeeId) {
        employeeService.deleteEmployee(1);
        final Response<Boolean> response = new Response<>("Successfully deleted", true);
        response.setData(true);
        return response;
    }

    public Response<List<Employee>> listEmployee() {
        final List<Employee> employees = employeeService.listEmployees();
        Response<List<Employee>> response = new Response<>("Employees retrieved successfully", true);
        response.setData(employees);
        return response;
    }

}
