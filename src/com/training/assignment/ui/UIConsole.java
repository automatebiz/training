package com.training.assignment.ui;

import com.training.assignment.controller.MenuController;
import com.training.assignment.framework.Menu;
import com.training.assignment.framework.MenuItem;

import java.util.List;
import java.util.Scanner;

public class UIConsole {

    private static MenuController menuController = new MenuController();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("Choose options from below!");
            printMenu(menuController.menus());
            final int usersChoice = askUsersChoice();
            System.out.println("You have chosen choice " + usersChoice);
        }
    }

    private static int askUsersChoice() {
        System.out.println("Choose your choice!");
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
