package com.nest.employeeappBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue
    private int id;
    private int empCode;
    private String name;
    private String dsgn;
    private int salary;
    private String companyName;
    private String mobileNumber;
    private String username;
    private String password;

    public Employee() {
    }

    public Employee(int id, int empCode, String name, String dsgn, int salary,
                    String companyName, String mobileNumber, String username, String password) {
        this.id = id;
        this.empCode = empCode;
        this.name = name;
        this.dsgn = dsgn;
        this.salary = salary;
        this.companyName = companyName;
        this.mobileNumber = mobileNumber;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public int getEmpCode() {
        return empCode;
    }

    public String getName() {
        return name;
    }

    public String getDsgn() {
        return dsgn;
    }

    public int getSalary() {
        return salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
