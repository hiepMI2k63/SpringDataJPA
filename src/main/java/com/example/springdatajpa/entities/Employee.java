package com.example.springdatajpa.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "employee")
public class Employee  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "account")
    private  String account;
    @Column(name = "department")
    private  String department;
    @Column(name = "employeeAddress")
    private  String employeeAddress;
    @Column(name = "employeeBirthday")
    private LocalDate employeeBirthday;
    @Email
    @Column(name = "employeeEmail")
    private  String employeeEmail;
    @Column(name = "employeeName")
    private  String employeeName;
    @Column(name = "employeePhone")
    private  String employeePhone;
    @Column(name = "password")
    private  String password;
    @Column(name = "sex")
    private  String sex;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getEmployeeAddress() {
        return employeeAddress;
    }
    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }
    public LocalDate getEmployeeBirthday() {
        return employeeBirthday;
    }
    public void setEmployeeBirthday(LocalDate employeeBirthday) {
        this.employeeBirthday = employeeBirthday;
    }
    public String getEmployeeEmail() {
        return employeeEmail;
    }
    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getEmployeePhone() {
        return employeePhone;
    }
    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }


}
