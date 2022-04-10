package com.example.springdatajpa.repo;

import com.example.springdatajpa.entities.BookingOffice;

import org.springframework.data.jpa.repository.JpaRepository;// có thêm hàm 	T getById(ID id);
import org.springframework.data.repository.CrudRepository;

public interface BookingOfficeRepository extends JpaRepository<BookingOffice,Integer> {
    
}
