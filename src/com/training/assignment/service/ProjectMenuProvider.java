package com.training.assignment.service;

import com.training.assignment.framework.Menu;
import com.training.assignment.framework.MenuItem;
import com.training.assignment.framework.MenuProvider;

public class ProjectMenuProvider implements MenuProvider {
    private final static Menu menu;
    private static final String PROJECT = "project";

    static {
        menu = new Menu(PROJECT,
                new MenuItem("Create Project", 1),
                new MenuItem("Update Project", 2),
                new MenuItem("Delete Project", 3),
                new MenuItem("List Project", 4));
    }


    @Override
    public Menu showMenu() {
        return menu;
    }

    @Override
    public String label() {
        return PROJECT;
    }
}
