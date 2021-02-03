package com.training.assignment.repository;

import com.training.assignment.exception.ValidationException;
import com.training.assignment.repository.entity.EmployeeEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
public class EmployeeRepositoryOld {

    private static final Map<Integer, EmployeeEntity> employeesData = new HashMap<>();

    public List<EmployeeEntity> fetchAll() {
        return new ArrayList<>(employeesData.values());
    }

    public EmployeeEntity save(EmployeeEntity employee) {
        final int uniqueIdentifier = EmployeeIDGenerator.generateID();
        return employeesData.put(uniqueIdentifier, employee);
    }

    public EmployeeEntity retrieve(final int key) {
        return employeesData.get(key);
    }

    public boolean delete(int employeeId) {
        if (employeesData.containsKey(employeeId)) {
            final EmployeeEntity employeeEntity = employeesData.remove(employeeId);
            return null != employeeEntity;
        }
        throw new ValidationException("Employee Id not found to delete");
    }
}
