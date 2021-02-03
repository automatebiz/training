package com.training.assignment.service;

public class EmployeeServiceOld {/*

    private static ArrayList<Employee> employees = new ArrayList();
    private static int identifier = 1;
    private static final String ID_PREFIX = "AUTOMATE";

    private static Employee createEmployee() {
        showAChoice("Provide Employee details!");
        final String name = takeName();
        final int salary = takeSalary();
        final int age = takeAge();
        Employee employee = createEmployeeObject(name, salary, age);
        employee.displayInformation();
        return employee;
    }

    private static Employee createEmployeeObject(String name, int salary, int age) {
        return new Employee(name, salary, ID_PREFIX + (identifier++), age);
    }

    private static void updateEmployee(String employeeId) {
        boolean isEmployeeFound = false;
        for (int i = 0; i < employees.size(); i++) {
            isEmployeeFound = employees.get(i).getUniqueIdentifier().equals(employeeId);
            if (isEmployeeFound) {
                processUpdate(employeeId, employees.get(i));
                break;
            }
        }
        if (!isEmployeeFound)
            System.out.println("Employee is not found to update!");

    }

    private static void processUpdate(String employeeId, Employee employee) {
        System.out.println("Enter the updated information for employee with id: " + employeeId);
        final String name = takeName();
        final int salary = takeSalary();
        final int age = takeAge();
        employee.update(name, salary, age);
    }

    private static void deleteEmployee(String employeeId) {
        // loop through employees list until you find the employee id to be deleted.
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getUniqueIdentifier().equals(employeeId)) {
                employees.remove(i);
                System.out.println("Employee with id : " + employeeId + " is deleted");
                break;
            }
        }

    }

    private static void listEmployees() {
        for (Employee e : employees) {
            e.displayInformation();
        }
    }

    private static int takeAge() {
        showAChoice("Age:");
        return scanner.nextInt();
    }

    private static String takeName() {
        showAChoice("Name:");
        final String name = scanner.next();

        if (!isNameValid(name))
            return takeName();
        else
            return name;
    }

    private static int takeSalary() {
        showAChoice("Salary:");
        return scanner.nextInt();
    }

    private static boolean isNameValid(String name) {
        final boolean matches = name.matches("^[a-zA-Z]*$");
        if (!matches) {
            askForNameAgain();
        }

        return matches;
    }

    private static void processUserChoiceForEmployeeFlow(int userChoice) {
        switch (userChoice) {
            case 1:
                final Employee employee = createEmployee();
                employees.add(employee);
                break;
            case 2:
                System.out.println("Which employee needs to be Updated? Give me the ID:");
                updateEmployee(scanner.next());
                break;
            case 3:
                System.out.println("Enter employee Id to delete!");
                deleteEmployee(scanner.next());
                break;
            case 4:
                listEmployees();
                break;
        }
    }

    private static void askForNameAgain() {
        System.out.println("Your name looks like invalid!Can you enter again!");
    }
*/
}
