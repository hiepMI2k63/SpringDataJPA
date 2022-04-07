package com.example.springdatajpa.repo;
import java.util.Optional;

import com.example.springdatajpa.entities.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CarRepository extends CrudRepository<Car, String> {


}
