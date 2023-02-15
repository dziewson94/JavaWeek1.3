package com.sii.academy.employee;

public abstract class Person {
    private String name;
    private String lastName;

    private String getFirstLetterUpRestLowerCase(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = getFirstLetterUpRestLowerCase(name);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = getFirstLetterUpRestLowerCase(lastName);
    }
}
