package com.employee.EmployeeApplication.service;

import com.employee.EmployeeApplication.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    List<Employee> employeeList = Arrays.asList(
            new Employee(1,"First Employee", "Washington"),
            new Employee(2,"Second Employee", "New York")
    );

    public List<Employee> getAllEmployees() {
        return employeeList;
    }
}
