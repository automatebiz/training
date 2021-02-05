package com.training.assignment.service;

import com.training.assignment.exception.ValidationException;
import com.training.assignment.framework.CRUDService;
import com.training.assignment.model.Employee;
import com.training.assignment.repository.EmployeeRepository;
import com.training.assignment.repository.AbstractRepository;
import com.training.assignment.repository.entity.EmployeeEntity;
import com.training.assignment.service.dto.EmployeeResponseDTO;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class EmployeeService implements CRUDService<Integer, Employee, EmployeeResponseDTO> {

    private final AbstractRepository<Integer, EmployeeEntity> employeeRepository = new EmployeeRepository();

    public boolean delete(Integer employeeId) {
        return employeeRepository.delete(employeeId);
    }

    @Override
    public EmployeeResponseDTO create(Employee employee) {
        EmployeeEntity employeeEntity = createEmployeeEntity(employee);
        final EmployeeEntity entity = employeeRepository.save(employeeEntity);
        return new EmployeeResponseDTO(entity);
    }

    private EmployeeEntity createEmployeeEntity(Employee employee) {
        return new EmployeeEntity(employee.getName(), employee.getSalary(), employee.getAge());
    }

    @Override
    public List<EmployeeResponseDTO> getAll() {
        return employeeRepository.fetchAll().stream().map(EmployeeResponseDTO::new).collect(Collectors.toList());
    }

    @Override
    public EmployeeResponseDTO update(Integer id, Employee employee) {
        EmployeeEntity employeeEntity = fetchOrThrowException(id);
        employeeEntity.setAge(employee.getAge());
        employeeEntity.setName(employee.getName());
        employeeEntity.setSalary(employee.getSalary());
        return new EmployeeResponseDTO(employeeRepository.save(employeeEntity));
    }

    @Override
    public EmployeeResponseDTO getById(Integer id) {
        return new EmployeeResponseDTO(fetchOrThrowException(id));
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
