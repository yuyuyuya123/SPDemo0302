package com.ex.spring.entity;

import java.util.List;

public class Company {
    private String companyName;
    private List<User> employees;

    public Company() {
    }

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public Company(String companyName, List<User> employees) {
        this.companyName = companyName;
        this.employees = employees;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<User> getEmployees() {
        return employees;
    }

    public void setEmployees(List<User> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", employees=" + employees +
                '}';
    }
}
