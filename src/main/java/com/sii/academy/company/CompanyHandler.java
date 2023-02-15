package com.sii.academy.company;

import com.sii.academy.employee.Employee;
import com.sii.academy.employee.Person;

public class CompanyHandler {

    private CompanyHandler(){}

    public static void addEmployee(Company company, Employee employee) {
        if (!doesCompanyContainsEmployee(employee, company)) {
            company.getEmployees().add(employee);
        } else {
            System.out.println("Employee exists!");
        }
    }

    private static boolean doesCompanyContainsEmployee(Employee employee, Company company) {
        for (Person employeeIt : company.getEmployees()) {
            if (employeeIt.equals(employee)) {
                return true;
            }
        }
        return false;
    }

    public static void printSumOfEmployessSalary(Company company) {
        int sum = 0;
        for (Person e : company.getEmployees()) {
            sum += ((Employee) e).getSalary();
        }
        System.out.printf("Sum of company employees salary is %d%n", sum);
    }

    public static void displayAllEmployeesData(Company company) {
        company.getEmployees().forEach(System.out::println);
    }
}
