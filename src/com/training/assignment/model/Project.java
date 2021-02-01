package com.training.assignment.model;

import java.util.Date;

public class Project {
    private String name;
    private Date startDate;
    private Date tentativeEndDate;

    public Project(String name, Date startDate, Date tentativeEndDate) {
        this.name = name;
        this.startDate = startDate;
        this.tentativeEndDate = tentativeEndDate;
    }
}
