package com.example.springdatajpa.dto.mapper;

import com.example.springdatajpa.dto.entities.CarDTO;
import com.example.springdatajpa.entities.Car;

public class CarMapper {
    private static CarMapper carMapper;

    public static CarMapper getCarMapper() {
        if (carMapper == null) {
            carMapper = new CarMapper();
        }
        return carMapper;
    }

    // Convert DTO into Entity
    public Car toEntity(CarDTO carDTO) {
        Car car = new Car();
        // không muốn lấy id -> tạo thêm contructor>>>>>> CHƯA TẠO CONTRUCTER KO CÓ ID
        car.setCarColor(carDTO.getCarColor());
        car.setCarType(carDTO.getCarType());
        car.setCompany(carDTO.getCompany());
        car.setLicensePlate(carDTO.getLicensePlate());

        return car;

    }

    // Convert Entity into DTO
    public CarDTO toDTO(Car Car) {
        CarDTO carDTO = new CarDTO();
        // không muốn lấy id -> tạo thêm contructor>>>>>> CHƯA TẠO CONTRUCTER KO CÓ ID
        carDTO.setCarColor(Car.getCarColor());
        carDTO.setCarType(Car.getCarType());
        carDTO.setCompany(Car.getCompany());
        carDTO.setLicensePlate(Car.getLicensePlate());

        return carDTO;

    }
}
