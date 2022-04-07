package com.example.springdatajpa.service;
import java.util.Collections;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import com.example.springdatajpa.entities.Employee;
import com.example.springdatajpa.repo.*;
import com.example.springdatajpa.service.Interface.IEmployeeService;
@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Transactional
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Transactional
    public Iterable<Employee> fillAll() {
            return employeeRepository.findAll();
    }

    @Transactional
    public Employee findByEmployeeId(int EmployeeeId) {
        Optional<Employee> bookResponse = employeeRepository.findById(EmployeeeId);
        Employee employee = bookResponse.get();
        return employee;
    }
    
}
