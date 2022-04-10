package com.example.springdatajpa.dto.entities;

import java.time.LocalDate;

public class EmployeeDTO {
    private  String account;
    
    private  String department;

    private  String employeeAddress;
   
    private LocalDate employeeBirthday;
  
    
    private  String employeeEmail;
        private  String employeeName;
    
    private  String employeePhone;

    private  String password;
    
    private  String sex;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String account, String department, String employeeAddress, LocalDate employeeBirthday,
            String employeeEmail, String employeeName, String employeePhone, String password, String sex) {
        this.account = account;
        this.department = department;
        this.employeeAddress = employeeAddress;
        this.employeeBirthday = employeeBirthday;
        this.employeeEmail = employeeEmail;
        this.employeeName = employeeName;
        this.employeePhone = employeePhone;
        this.password = password;
        this.sex = sex;
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
