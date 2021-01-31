package com.training.assignment.service;

import com.training.assignment.framework.Menu;
import com.training.assignment.framework.MenuItem;
import com.training.assignment.framework.MenuProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MenuService {

    MenuProvider employeeMenuProvider = new EmployeeMenuProvider();
    MenuProvider projectMenuProvider = new ProjectService();

    public List<Menu> menus() {
        List<Menu> allMenus = new ArrayList<>();
        allMenus.add(employeeMenuProvider.showMenu());
        allMenus.add(projectMenuProvider.showMenu());
        return allMenus;
    }

    public List<MenuItem> menuItems(final String label) {
        switch (label) {
            case "employee":
                return employeeMenuProvider.showMenu().getMenuItems();
            case "project":
                return projectMenuProvider.showMenu().getMenuItems();
        }
        return Collections.emptyList();
    }

    public List<String> labels() {
        return Arrays.asList(employeeMenuProvider.label(), projectMenuProvider.label());
    }
}
