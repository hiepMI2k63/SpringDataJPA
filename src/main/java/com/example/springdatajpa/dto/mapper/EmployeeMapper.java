package com.example.springdatajpa.dto.mapper;

import com.example.springdatajpa.dto.entities.EmployeeDTO;
import com.example.springdatajpa.entities.Employee;

public class EmployeeMapper {
    private static EmployeeMapper employeeMapper;

    public static EmployeeMapper getOfficeMapper() {
        if (employeeMapper == null) {
            employeeMapper = new EmployeeMapper();
        }
        return employeeMapper;
    }

    // Convert DTO into EntityT
    public Employee toEntity(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        // không muốn lấy id -> tạo thêm contructor>>>>>> CHƯA TẠO CONTRUCTER KO CÓ ID
        employee.setAccount(employeeDTO.getAccount());
        ;
        employee.setDepartment(employeeDTO.getDepartment());
        employee.setEmployeeAddress(employeeDTO.getEmployeeAddress());
        employee.setEmployeeBirthday(employeeDTO.getEmployeeBirthday());
        employee.setEmployeeEmail(employeeDTO.getEmployeeEmail());
        employee.setEmployeeName(employeeDTO.getEmployeeName());
        employee.setEmployeePhone(employeeDTO.getEmployeePhone());
        employee.setPassword(employeeDTO.getPassword());
        employee.setSex(employeeDTO.getSex());
        return employee;

    }

    // Convert Entity into DTO
    public EmployeeDTO toDTO(Employee employee) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        // không muốn lấy id -> tạo thêm contructor>>>>>> CHƯA TẠO CONTRUCTER KO CÓ ID
        employeeDTO.setAccount(employee.getAccount());
        ;
        employeeDTO.setDepartment(employee.getDepartment());
        employeeDTO.setEmployeeAddress(employee.getEmployeeAddress());
        employeeDTO.setEmployeeBirthday(employee.getEmployeeBirthday());
        employeeDTO.setEmployeeEmail(employee.getEmployeeEmail());
        employeeDTO.setEmployeeName(employee.getEmployeeName());
        employeeDTO.setEmployeePhone(employee.getEmployeePhone());
        employeeDTO.setPassword(employee.getPassword());
        employeeDTO.setSex(employee.getSex());
        return employeeDTO;

    }
}
