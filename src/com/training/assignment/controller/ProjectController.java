package com.training.assignment.controller;

import com.training.assignment.framework.AbstractCRUDController;
import com.training.assignment.framework.CRUDService;
import com.training.assignment.model.Employee;
import com.training.assignment.model.Project;
import com.training.assignment.model.Response;
import com.training.assignment.service.ProjectResponseDTO;
import com.training.assignment.service.ProjectService;
import com.training.assignment.service.dto.EmployeeResponseDTO;

import java.time.LocalDate;
import java.util.List;

public class ProjectController extends AbstractCRUDController<Integer, Project, ProjectResponseDTO> {

    private final ProjectService projectService = new ProjectService();

    public Response<?> create(final String name, final LocalDate startDate, final LocalDate tentativeEndDate) {
        return create(new Project(name, tentativeEndDate, tentativeEndDate));
    }

    public Response<?> update(Integer id, final String name, final LocalDate startDate, final LocalDate tentativeEndDate) {
        return update(id, new Project(name, tentativeEndDate, tentativeEndDate));
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
    public CRUDService<Integer, Project, ProjectResponseDTO> service() {
        return projectService;
    }

}
