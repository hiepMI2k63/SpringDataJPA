package com.example.springdatajpa.repo;

import com.example.springdatajpa.entities.BookingOffice;

import org.springframework.data.repository.CrudRepository;

public interface BookingOfficeRepository extends CrudRepository<BookingOffice,Integer> {
    
}
