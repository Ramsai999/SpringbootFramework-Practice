package com.example.annotations.autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {
    @Value("#{111}")
    private int employeeId;
    @Value("Sagar")
    private String firstName;
    @Value("P")
    private String lastName;
    @Value("#{10000}")
    private double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
