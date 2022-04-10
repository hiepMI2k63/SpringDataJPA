package com.example.springdatajpa.repo;
import com.example.springdatajpa.entities.*;

import org.springframework.data.jpa.repository.JpaRepository;


public interface TripRepository extends JpaRepository<Trip,Integer> {
  
}
