package com.training.assignment.controller;

import com.training.assignment.model.Employee;
import com.training.assignment.model.Response;
import com.training.assignment.service.EmployeeService;
import com.training.assignment.service.dto.EmployeeResponseDTO;

import java.util.List;

/**
 * Controller only handles the incoming requests.
 */
public final class EmployeeController {

    private final EmployeeService employeeService = new EmployeeService();

    public Response<?> createEmployee(final String name, final int age, final int salary) {
        final Employee employee = new Employee(name, salary, age);
        if (employee.isDataValid()) {
            return proceedWithCreate(employee);
        }
        return erroneousResponse("Employee creation failed due to invalid data");
    }

    private Response<?> proceedWithCreate(Employee employee) {
        final EmployeeResponseDTO employeeResponse = employeeService.createEmployee(employee);
        return Response.defaultSuccessResponse(employeeResponse, "Employee created successfully!");
    }

    public Response<?> updateEmployee(int employeeId, final String name, final int age,
                                      final int salary) {
        final Employee employee = new Employee(name, salary, age);
        if (employee.isDataValid()) {
            return proceedWithUpdate(employeeId, employee);
        }
        return erroneousResponse("Employee update failed, due to invalid data");
    }

    private Response<EmployeeResponseDTO> proceedWithUpdate(int employeeId, Employee employee) {
        final EmployeeResponseDTO employeeResponseDTO = employeeService.updateEmployee(employeeId, employee);

        return Response.defaultSuccessResponse(employeeResponseDTO, "Employee update has been successful!");
    }

    public Response<Boolean> deleteEmployee(int employeeId) {
        return new Response<>("Successfully deleted", true, employeeService.deleteEmployee(employeeId));
    }

    public Response<List<EmployeeResponseDTO>> listEmployees() {
        return new Response<>("Employees retrieved successfully", true, employeeService.listEmployees());
    }

    public Response<EmployeeResponseDTO> fetchEmployeeById(final int id) {
        return Response.defaultSuccessResponse(employeeService.fetchEmployeeById(id),
                "Employee retrieved successfully");
    }

    private Response<Void> erroneousResponse(String responseMessage) {
        return Response.defaultErrorResponse(responseMessage);
    }

}
