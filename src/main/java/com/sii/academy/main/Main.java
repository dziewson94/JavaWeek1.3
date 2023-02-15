package com.sii.academy.main;

import com.sii.academy.company.Company;
import com.sii.academy.utils.UserInputHandler;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        UserInputHandler.initializeCompany(5, company);
        UserInputHandler.execute(company);

    }
}