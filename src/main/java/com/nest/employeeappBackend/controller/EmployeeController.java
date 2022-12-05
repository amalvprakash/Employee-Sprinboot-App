package com.nest.employeeappBackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String Home(){
        return "Welcome to Homepage";
    }

    @GetMapping("/add")
    public String Add(){
        return "Add employee";
    }

    @GetMapping("/edit")
    public String Edit(){
        return "Edit Employee";
    }

    @GetMapping("/delete")
    public String Delete(){
        return "Delete Employee"
    }
}
