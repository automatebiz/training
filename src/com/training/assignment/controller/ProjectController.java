package com.training.assignment.controller;

import com.training.assignment.framework.ValidationError;
import com.training.assignment.framework.ValidationResponse;
import com.training.assignment.model.Project;
import com.training.assignment.model.Response;
import com.training.assignment.service.ProjectService;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class ProjectController  {

    private final ProjectService projectService = new ProjectService();

    public Response createProject(String nameOfTheProject,
                                  LocalDate startDate, LocalDate tentativeEndDate) {

        Project project = new Project(nameOfTheProject, startDate, tentativeEndDate);
        final ValidationResponse validationResponse = project.validate();
        if (validationResponse.isErrorExists())
            return erroneousResponse("Unable to proceed with project creation.", validationResponse.getErrorMap());

        // 3. Invoke service layer for creating a project
        final int projectIdentifier = projectService.createProject(project);
        final Response<Integer> response = new Response("Project is created Successfully.", true);
        response.setData(projectIdentifier);
        return response;
    }

    private Response<?> erroneousResponse(String errorMessage, Map<String, ValidationError> errorMap) {
        return new Response(errorMessage, false, errorMap);
    }


    public Response updateProject(String projectId) {

        //TODO: yet to implement
        return null;
    }

    public Response deleteProject(String projectId) {
        //TODO: yet to implement
        return null;
    }

    public Response<List<Project>> listProjects() {
        //TODO: yet to implement
        return null;
    }

}
