package com.training.assignment.controller;

import com.training.assignment.framework.Menu;
import com.training.assignment.framework.MenuItem;
import com.training.assignment.service.MenuService;

import java.util.List;

public class MenuController {

    private MenuService menuService = new MenuService();

    public List<Menu> menus() {
        return menuService.menus();
    }

    public List<MenuItem> menuItems(final String label) {
        return menuService.menuItems(label);
    }

    public List<String> parentMenu() {
        return menuService.labels();
    }
}
