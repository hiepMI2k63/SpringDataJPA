package com.example.springdatajpa.repo;

import java.util.Set;

import com.example.springdatajpa.entities.ParkingLot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ParkingLotRepository extends JpaRepository<ParkingLot,Integer> {
    
}
