package com.example.springdatajpa.dto.serviceMapper.InterfaceMapper;

import com.example.springdatajpa.dto.entities.CarDTO;

import java.util.List;

public interface ICarServiceMapper {
    List<CarDTO> viewCar();
    CarDTO addCar(CarDTO carDTO, Integer tripId);
    CarDTO editCar(CarDTO carDTO, Integer officeId, Integer tripId);
    void deleteCar(Integer id);
}
