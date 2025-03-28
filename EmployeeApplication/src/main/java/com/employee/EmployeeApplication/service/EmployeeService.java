package com.employee.EmployeeApplication.service;

import com.employee.EmployeeApplication.entity.Employee;
import com.employee.EmployeeApplication.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    List<Employee> employeeList = new ArrayList<>(Arrays.asList(
            new Employee(1,"First Employee", "Washington"),
            new Employee(2,"Second Employee", "New York")
    ));

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
//        return employeeList;
        return employeeRepository.findAll();
    }

    public Employee getAnEmployee(int id){
//        return employeeList.stream().filter(e -> (
//                e.getEmployeeId() == id)).findFirst().get();
        return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    public void createEmployee(Employee employee){
        //employeeList.add(employee);
        employeeRepository.save(employee);
    }

    public void updateEmployee(Employee employee){
//        ArrayList<Employee> tempEmployee = new ArrayList<>();
//        for (Employee emp : employeeList){
//            if (emp.getEmployeeId() == employee.getEmployeeId()){
//                emp.setEmployeeName(employee.getEmployeeName());
//                emp.setEmployeeCity(employee.getEmployeeCity());
//            }
//            tempEmployee.add(emp);
//        }
//        this.employeeList = tempEmployee;
        employeeRepository.save(employee);
    }

    public void deleteEmployee(int id){
//        ArrayList<Employee> tempEmployee = new ArrayList<>();
//        for (Employee emp : employeeList){
//            if (emp.getEmployeeId() == id){
//                continue;
//            }
//            tempEmployee.add(emp);
//        }
//        this.employeeList = tempEmployee;
        employeeRepository.delete(employeeRepository.getById(id));
    }
}
