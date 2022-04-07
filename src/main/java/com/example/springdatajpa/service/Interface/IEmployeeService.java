package com.example.springdatajpa.service.Interface;

import com.example.springdatajpa.entities.Employee;

public interface IEmployeeService {
    Employee saveEmployee(Employee Employee);
    Iterable<Employee> fillAll();
     Employee findByEmployeeId(int EmployeeId);
 
}
