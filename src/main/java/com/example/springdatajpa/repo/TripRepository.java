package com.example.springdatajpa.repo;
import com.example.springdatajpa.entities.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TripRepository extends CrudRepository<Trip,Integer> {
    
}
