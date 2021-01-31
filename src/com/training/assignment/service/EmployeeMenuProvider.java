package com.training.assignment.service;

import com.training.assignment.framework.Menu;
import com.training.assignment.framework.MenuItem;
import com.training.assignment.framework.MenuProvider;

public class EmployeeMenuProvider implements MenuProvider {

    private final static Menu menu;
    private static final String EMPLOYEE = "employee";

    static {
        menu = new Menu(EMPLOYEE, new MenuItem("Create Employee", 1),
                new MenuItem("Update Employee", 2),
                new MenuItem("Delete Employee", 3),
                new MenuItem("List Employee", 4));
    }

    @Override
    public Menu showMenu() {
        return menu;
    }

    @Override
    public String label() {
        return EMPLOYEE;
    }
}
