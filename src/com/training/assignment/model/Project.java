package com.training.assignment.model;

import com.training.assignment.framework.ValidationError;
import com.training.assignment.framework.ValidationResponse;
import com.training.assignment.framework.Validator;

import java.time.LocalDate;

public class Project implements Validator {
    private String name;
    private LocalDate startDate;
    private LocalDate tentativeEndDate;

    public Project(String name, LocalDate startDate, LocalDate tentativeEndDate) {
        this.name = name;
        this.startDate = startDate;
        this.tentativeEndDate = tentativeEndDate;
    }

    @Override
    public ValidationResponse validate() {
        ValidationResponse validationResponse = new ValidationResponse();
        if (name == null) {
            validationResponse.addError(new ValidationError("name", "Project name is required"));
        }

        if (startDate == null) {
            validationResponse.addError(new ValidationError("name", "Start date can not be empty."));
        } else if (startDate.isBefore(LocalDate.now()))
            validationResponse.addError(new ValidationError("name", "Start date can not be in the past."));
        return validationResponse;
    }

}
