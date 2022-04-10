package com.example.springdatajpa.service;

import java.util.Collections;
import java.util.Optional;

import com.example.springdatajpa.entities.ParkingLot;
import com.example.springdatajpa.exception.DuplicatedException;
import com.example.springdatajpa.service.Interface.IParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.collections.List;

import javax.transaction.Transactional;

import com.example.springdatajpa.entities.Car;
import com.example.springdatajpa.exception.NotFoundException;
import com.example.springdatajpa.repo.*;
import com.example.springdatajpa.service.Interface.ICarService;

@Service

public class CarService implements ICarService  {
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private ParkingLotRepository parkingLotRepository;
    @Autowired
    private ParkingLotService parkingLotService;
    @Autowired
    private CarService carService;
    @Transactional
    public Car saveCar(Car Car) {
        return carRepository.save(Car);
   // return null;
    }
    
    @Override
    public java.util.List<Car> fillAllCars() {
        return carRepository.findAll();
    }

    @Override /// thay kieer
    public Car addCar(Car car, Integer parkId) {
        //check if there is any car with the ID exists in DB
         if (!this.carRepository.existsById(car.getLicensePlate())) {
             ParkingLot parkingLot = parkingLotRepository.findById(parkId).
                     orElseThrow(() -> new NotFoundException("Error! No parking lot with the given ID was found!"));
             car.setParkingLot(parkingLot);
             return carRepository.save(car);
         } else {
             throw new DuplicatedException("Error! License plate has already existed");
         }

    }

    @Override
    public Car editCar(Car car, String carId, Integer parkId) {
       //check if the car with the given exists
        if (carService.existedById(carId)) {
         //check if the park with the given ID exists
         if (parkingLotService.existedById(parkId)) {
             ParkingLot parkingLot = parkingLotRepository.getById(parkId);
             car.setParkingLot(parkingLot);
             return carRepository.save(car);
         } else {
             throw new NotFoundException("Error! Car does not exist");
         }
     } else {
         throw new NotFoundException("Error! Parking lot does not exist");
     }
    }

    @Override
    public void deleteCar(String licensePlate) {
         if (carService.existedById(licensePlate)) {
             Car carToDelete = carRepository.getById(licensePlate);
             carRepository.delete(carToDelete);
         } else {
             throw new NotFoundException("Error! No car with the given license plate was found!");
         }
    }

    @Override
    public boolean existedById(String licensePlate) {
             return carRepository.existsById(licensePlate);
    }

   


}
