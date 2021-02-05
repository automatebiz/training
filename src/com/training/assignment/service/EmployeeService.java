package com.training.assignment.service;

import com.training.assignment.exception.ValidationException;
import com.training.assignment.model.Employee;
import com.training.assignment.repository.EmployeeRepository;
import com.training.assignment.repository.GenericRepository;
import com.training.assignment.repository.entity.EmployeeEntity;
import com.training.assignment.service.dto.EmployeeResponseDTO;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class EmployeeService {

    private final GenericRepository<Integer, EmployeeEntity> employeeRepository = new EmployeeRepository();

    public EmployeeResponseDTO createEmployee(final Employee employee) {
        EmployeeEntity employeeEntity = createEmployeeEntity(employee);
        final EmployeeEntity entity = employeeRepository.save(employeeEntity);
        return new EmployeeResponseDTO(entity);
    }

    private EmployeeEntity createEmployeeEntity(Employee employee) {
        return new EmployeeEntity(employee.getName(), employee.getSalary(), employee.getAge());
    }

    public boolean deleteEmployee(int employeeId) {
        return employeeRepository.delete(employeeId);
    }

    public List<EmployeeResponseDTO> listEmployees() {
        // Fetch all employees from repository and convert to response DTO
        return employeeRepository.fetchAll().stream().map(EmployeeResponseDTO::new).collect(Collectors.toList());
    }

    public EmployeeResponseDTO updateEmployee(int employeeId, Employee employee) {
        EmployeeEntity employeeEntity = fetchOrThrowException(employeeId);
        employeeEntity.setAge(employee.getAge());
        employeeEntity.setName(employee.getName());
        employeeEntity.setSalary(employee.getSalary());
        return new EmployeeResponseDTO(employeeRepository.save(employeeEntity));
    }

    public EmployeeResponseDTO fetchEmployeeById(int employeeId) {
        return new EmployeeResponseDTO(fetchOrThrowException(employeeId));
    }

    private EmployeeEntity fetchOrThrowException(int employeeId) {
        if (employeeId < 0)
            throw new ValidationException("Invalid employee id");
        final EmployeeEntity employeeEntity = employeeRepository.retrieve(employeeId);
        if (Objects.isNull(employeeEntity))
            throw new ValidationException("Employee not found for the given id.");
        return employeeEntity;
    }
}
