package com.example.springdatajpa.service;

import java.util.Collections;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import com.example.springdatajpa.entities.Car;
import com.example.springdatajpa.exception.NotFoundException;
import com.example.springdatajpa.repo.*;
import com.example.springdatajpa.service.Interface.ICarService;

@Service
// implements ICarService
public class CarService implements ICarService {
    @Autowired
    private CarRepository carRepository;

    @Transactional
    public Car saveCar(Car Car) {
        return carRepository.save(Car);
    }
    @Transactional
    public Iterable<Car> fillAll() {
        return carRepository.findAll();
    }

//    @Transactional
//    public Car deleteCar(Car Car) {
//        carRepository.delete(Car);
//        return Car;
//    }
//
//    public Car findByCarId(String CarId) {
//        Optional<Car> CarResponse = carRepository.findById(CarId);
//        Car Car = CarResponse.get();
//        return Car;
//    }
//
//    @Override
//    public String deleteCarByID(String id) {
//        carRepository.deleteAllById(Collections.singleton(String.valueOf(id)));
//        return id;
//    }
//
//
}
