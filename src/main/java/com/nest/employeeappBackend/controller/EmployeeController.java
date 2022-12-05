package com.nest.employeeappBackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String Home(){
        return "Welcome to Homepage";
    }
}
