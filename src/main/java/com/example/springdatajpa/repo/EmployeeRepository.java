package com.example.springdatajpa.repo;
import com.example.springdatajpa.entities.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
    
}
