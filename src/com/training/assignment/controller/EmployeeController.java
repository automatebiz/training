package com.training.assignment.controller;

import com.training.assignment.framework.AbstractCRUDController;
import com.training.assignment.framework.CRUDService;
import com.training.assignment.model.Employee;
import com.training.assignment.model.Response;
import com.training.assignment.service.EmployeeService;
import com.training.assignment.service.dto.EmployeeResponseDTO;

import java.util.List;

/**
 * Controller only handles the incoming requests.
 */
public final class EmployeeController extends AbstractCRUDController<Integer, Employee, EmployeeResponseDTO> {

    private final EmployeeService employeeService = new EmployeeService();

    public Response<?> create(final String name, final int age, final int salary) {
        return create(new Employee(name, salary, age));
    }

    public Response<?> update(Integer id, final String name, final int age, final int salary) {
        return update(id, new Employee(name, salary, age));
    }

    public Response<Boolean> delete(Integer id) {
        return delete(id);
    }

    public Response<List<EmployeeResponseDTO>> listAll() {
        return listAll();
    }

    public Response<EmployeeResponseDTO> fetchById(final Integer id) {
        return byId(id);
    }


    @Override
    public CRUDService<Integer, Employee, EmployeeResponseDTO> service() {
        return employeeService;
    }
}
