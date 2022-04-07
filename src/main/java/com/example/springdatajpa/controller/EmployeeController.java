package com.example.springdatajpa.controller;
import com.example.springdatajpa.entities.Employee;
import com.example.springdatajpa.service.Interface.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;
    @RequestMapping(value = "/saveemployee",method = RequestMethod.POST)
    @ResponseBody
    public Employee saveEmployee( @Valid @RequestBody Employee employee) {
        Employee employeeResponse = employeeService.saveEmployee(employee);
        return employeeResponse;
    }
    
    @GetMapping("/getall")
    public Iterable<Employee> getAll(){
       return employeeService.fillAll();
        
    }


    // @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    // @ResponseBody
    // public Employee deleteEmployee(@RequestBody Employee employee) {
    //     Employee employeeResponse = (Employee) employeeService.deleteEmployee(employee);
    //     return employeeResponse;
    // }
    // @RequestMapping(value = "/deleteById/{id}", method = RequestMethod.DELETE)
    // @ResponseBody
    // public Integer deleteemployeeByID(@PathVariable int id) {
    //     Integer employeeResponse =  employeeService.deleteEmployeeByID(id);
    //     return employeeResponse;
    // }

    @RequestMapping(value = "/{employeeId}",method = RequestMethod.GET)
    @ResponseBody
    public Employee getEmployeeDetails(@PathVariable int employeeId) {
        Employee employeeResponse = employeeService.findByEmployeeId(employeeId);

        return employeeResponse;
    }
    // @RequestMapping(value = "/update", method = RequestMethod.PUT)
    // @ResponseBody
    // public Employee updateEmployee(@RequestBody Employee employee) {
    //     Employee employeeResponse = (Employee) employeeService.saveEmployee(employee);
    //     return employeeResponse;
    // }

}
