package com.sii.academy.utils;

import com.sii.academy.company.Company;
import com.sii.academy.company.CompanyHandler;
import com.sii.academy.employee.Employee;

import java.util.Scanner;

public class UserInputHandler {
    private UserInputHandler(){}
    private static String getInputFromUserConsole(String message, String pattern) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(message);
            String input = scanner.nextLine().toLowerCase().trim();
            if (!input.isEmpty() && input.matches(pattern)) {
                return input;
            }
        }
    }

    public static String getStringFromUserConsole(String message) {
        return getInputFromUserConsole(message, "[a-z]*");
    }

    public static int getIntegerFromUserConsole(String message) {
        return Integer.parseInt(getInputFromUserConsole(message, "[0-9]*"));
    }

    public static int getRestrictedIntegerFromUserConsole(String message) {
        int result;
        do {
            result = getIntegerFromUserConsole(message);
        } while (result <= 0);
        return result;
    }

    public static Employee getEmployeeFromUser() {
        return new Employee(getStringFromUserConsole("Provide employee name. Only alphabetic characters."), getStringFromUserConsole("Provide employee last name. Only alphabetic characters."), getRestrictedIntegerFromUserConsole("Provide employee salary. Value should be integer > 0."));
    }

    public static void initializeCompany(int numOfEmployees, Company company) {
        for (int i = 0; i < numOfEmployees; i++) {
            CompanyHandler.addEmployee(company, getEmployeeFromUser());
        }
    }

    public static void execute(Company company) {
        boolean execute = true;
        while (execute) {
            int option = getRestrictedIntegerFromUserConsole("Select :%n%n1 – Print sum of all employees salary%n%n2 – Display all employees data%n%n3 – Add new employee%n%n4 or more – End program".formatted());
            switch (option) {
                case 1 -> CompanyHandler.printSumOfEmployessSalary(company);
                case 2 -> CompanyHandler.displayAllEmployeesData(company);
                case 3 -> CompanyHandler.addEmployee(company, getEmployeeFromUser());
                default -> execute = false;
            }
        }
    }
}
