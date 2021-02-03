package com.training.assignment.ui;

import com.training.assignment.controller.EmployeeController;
import com.training.assignment.controller.MenuController;
import com.training.assignment.framework.Menu;
import com.training.assignment.framework.MenuItem;
import com.training.assignment.model.Employee;
import com.training.assignment.model.Response;

import java.util.List;
import java.util.Scanner;

public class UIConsole {

    private static final MenuController menuController = new MenuController();

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("Choose options from below!");
            print(menuController.parentMenu());
            final int usersChoice = askUsersChoice();
            System.out.println("You have chosen choice " + usersChoice);
        }
    }

    private static void print(List<String> parentMenu) {
        parentMenu.forEach(System.out::println);
    }

    private static int askUsersChoice() {
        System.out.println("Choose your choice!");

        EmployeeController employeeController = new EmployeeController();
        final Response<List<Employee>> listResponse = employeeController.listEmployees();
        return scanner.nextInt();
    }

    private static void printMenu(List<Menu> menus) {
        for (Menu menu : menus) {
            System.out.println(menu.getLabel() + ":");
            for (MenuItem menuItem : menu.getMenuItems()) {
                System.out.println(menuItem.getId() + ". " + menuItem.getName());
            }
        }
    }
}
