package com.example.annotations.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Value("#{101}")
    private int employeeId;
    @Value("Rakesh")
    private String firstName;
    @Value("s")
    private String lastName;
    @Value("#{9999}")
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
