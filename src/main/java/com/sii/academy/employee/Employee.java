package com.sii.academy.employee;

import java.util.Objects;

public class Employee extends Person {
    private final int salary ;

    public Employee(String name, String lastName, int salary) {
        super();
        this.setName(name);
        this.setLastName(lastName);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Salary for %s %s is %d", getName(), getLastName(), getSalary());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && employee.getName().equals(this.getName()) && employee.getLastName().equals(this.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary);
    }
}
