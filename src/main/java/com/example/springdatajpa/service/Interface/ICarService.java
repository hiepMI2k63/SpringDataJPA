package com.example.springdatajpa.service.Interface;

import com.example.springdatajpa.entities.Car;

public interface ICarService {
    Car saveCar(Car Car);
    Iterable<Car> fillAll();

}
