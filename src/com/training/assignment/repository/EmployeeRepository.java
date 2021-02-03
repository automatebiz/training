package com.training.assignment.repository;

import com.training.assignment.repository.entity.EmployeeEntity;

import java.util.HashMap;
import java.util.Map;

public class EmployeeRepository extends GenericRepository<Integer, EmployeeEntity> {

    private static final Map<Integer, EmployeeEntity> data = new HashMap<>();

    @Override
    public Map<Integer, EmployeeEntity> data() {
        return data;
    }

    @Override
    protected Integer generateId() {
        return EmployeeIDGenerator.generateID();
    }
}
