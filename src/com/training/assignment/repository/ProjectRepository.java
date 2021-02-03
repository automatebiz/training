package com.training.assignment.repository;

import com.training.assignment.repository.entity.ProjectEntity;

import java.util.HashMap;
import java.util.Map;

public class ProjectRepository extends GenericRepository<Integer, ProjectEntity> {

    private static final Map<Integer, ProjectEntity> data = new HashMap<>();

    @Override
    public Map<Integer, ProjectEntity> data() {
        return data;
    }

    @Override
    protected Integer generateId() {
        return ProjectIDGenerator.generateID();
    }
}