package com.nest.employeeappBackend.controller;

import com.nest.employeeappBackend.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @PostMapping("/")
    public String Home(){
        return "Welcome to Homepage";
    }

    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public String Add(@RequestBody Employee m){
        System.out.println(m.getEmpCode());
        System.out.println(m.getName().toString());
        System.out.println(m.getDsgn().toString());
        System.out.println(m.getCompanyName().toString());
        System.out.println(m.getSalary());
        return " Employee Added";
    }

    @PostMapping("/edit")
    public String Edit(){
        return "Edit Employee";
    }

    @PostMapping("/delete")
    public String Delete(){
        return "Delete Employee";
    }

    @PostMapping("/search")
    public String Search(){
        return "Search Employee";
    }

    @GetMapping("/viewall")
    public String ViewAll(){
        return "View all employees";
    }
}
