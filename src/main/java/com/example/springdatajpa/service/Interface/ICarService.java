package com.example.springdatajpa.service.Interface;

import com.example.springdatajpa.entities.Car;

// import antlr.collections.List;
import java.util.List;

public interface ICarService {
    Car saveCar(Car Car);
    List<Car> fillAllCars();
    Car addCar(Car car, Integer parkId);
    Car editCar(Car car, String carId, Integer parkId);
    void deleteCar(String licensePlate);
    boolean existedById(String licensePlate);
}
