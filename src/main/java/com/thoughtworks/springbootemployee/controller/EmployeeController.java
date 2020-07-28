package com.thoughtworks.springbootemployee.controller;

import com.thoughtworks.springbootemployee.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private static final String ADD_EMPLOYEE_SUCCESS = "Add Employee success";
    private static final String UPDATE_EMPLOYEE_SUCCESS = "Update Employee success";
    private static final String DELETE_EMPLOYEE_SUCCESS = "Delete Employee success";

    @GetMapping
    public List<Employee> getEmployees() {
        return getEmployeeData();
    }

    @PostMapping
    public String addEmployee() {
        return ADD_EMPLOYEE_SUCCESS;
    }

    @PutMapping("/{id}")
    public String updateEmployee(@PathVariable("id") String id){
        return UPDATE_EMPLOYEE_SUCCESS;
    }

    @DeleteMapping("/id")
    public String deleteEmployee(@PathVariable("id") String id){
        return DELETE_EMPLOYEE_SUCCESS;
    }

    private List<Employee> getEmployeeData() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(0, "xiaoming", 20, "Male"));
        employees.add(new Employee(1, "xiaohong", 19, "Female"));
        employees.add(new Employee(2, "xiaozhi", 15, "Male"));
        employees.add(new Employee(3, "xiaogang", 16, "Male"));
        employees.add(new Employee(4, "xiaoxia", 15, "Female"));
        return employees;
    }
}
