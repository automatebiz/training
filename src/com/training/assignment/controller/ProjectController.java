package com.training.assignment.controller;

import com.training.assignment.model.Project;
import com.training.assignment.model.Response;
import com.training.assignment.service.ProjectService;

import java.util.Date;

public class ProjectController {


    private ProjectService projectService = new ProjectService();

    public Response createProject(String nameOfTheProject,
                                  Date startDate, Date tentativeEndDate) {

        // 1. Validation 1. Name must not be empty 2. Start Date must be there
        final boolean validationIsSuccess = validate(nameOfTheProject, startDate);

        if (validationIsSuccess) {
            // 2. Create model object
            Project project = new Project(nameOfTheProject, startDate, tentativeEndDate);

            // 3. Invoke service layer for creating a project
            projectService.createProject(project);
            return new Response("Employee is created Successfully.", true);
        } else {
            return new Response("Can not create project due to invalid data.",
                    false);
        }


    }

    private boolean validate(String nameOfTheProject, Date startDate) {
        boolean validationIsSuccess = true;
        if (nameOfTheProject == null) {
            System.out.println("Project name is required");
            validationIsSuccess = false;
        }

        if (startDate == null) {
            System.out.println("Project start date is required");
            validationIsSuccess = false;
        }
        return validationIsSuccess;
    }

    public void updateProject(String projectId) {

    }

    public void deleteProject(String projectId) {

    }

    public void listProject() {

    }

}
