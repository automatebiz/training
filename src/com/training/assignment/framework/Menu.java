package com.training.assignment.framework;

import java.util.Arrays;
import java.util.List;

/**
 * "Create Employee", "Employee Menu"
 * "Delete Employee", "Employee Menu"
 * "Update Employee", "Employee Menu"
 * <p>
 * List
 * Map<"employee", list>
 * <p>
 * Menu employeeMenu = new Menu();
 * Menu projectMenu = new Menu();
 */
public class Menu {
    private final String label;
    private final List<MenuItem> menuItems;

    public Menu(String label, List<MenuItem> menuItems) {
        this.label = label;
        this.menuItems = menuItems;
    }

    public Menu(String label, MenuItem... menuItems) {
        this.label = label;
        this.menuItems = Arrays.asList(menuItems);
    }

    public String getLabel() {
        return label;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "label='" + label + '\'' +
                ", menuItems=" + menuItems +
                '}';
    }
}
