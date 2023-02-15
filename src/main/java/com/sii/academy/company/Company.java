package com.sii.academy.company;

import com.sii.academy.employee.Person;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private final List<Person> employees = new ArrayList<>();

    public List<Person> getEmployees() {
        return employees;
    }

}
