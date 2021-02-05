package com.training.assignment.service;

import com.training.assignment.framework.CRUDService;
import com.training.assignment.model.Project;
import com.training.assignment.repository.AbstractRepository;
import com.training.assignment.repository.ProjectRepository;
import com.training.assignment.repository.entity.ProjectEntity;

import java.util.List;

/**
 * @author Chandrashekar V
 */
public class ProjectService implements CRUDService<Integer, Project, ProjectResponseDTO> {

    private final AbstractRepository<Integer, ProjectEntity> employeeRepository = new ProjectRepository();

    @Override
    public ProjectResponseDTO create(Project project) {
        // TODO: Implementation goes here
        return null;
    }

    @Override
    public List<ProjectResponseDTO> getAll() {
        // TODO: Implementation goes here
        return null;
    }

    @Override
    public ProjectResponseDTO update(Integer id, Project project) {
        // TODO: Implementation goes here
        return null;
    }

    @Override
    public ProjectResponseDTO getById(Integer id) {
        // TODO: Implementation goes here
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        // TODO: Implementation goes here
        return false;
    }
}
