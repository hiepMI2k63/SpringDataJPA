package com.example.springdatajpa.dto.serviceMapper.Service;

import com.example.springdatajpa.dto.entities.BookOfficeDTO;
import com.example.springdatajpa.dto.entities.CarDTO;
import com.example.springdatajpa.dto.mapper.BookOfficeMapper;
import com.example.springdatajpa.dto.mapper.CarMapper;
import com.example.springdatajpa.dto.serviceMapper.InterfaceMapper.ICarMapper;
import com.example.springdatajpa.dto.serviceMapper.InterfaceMapper.iBookOfficeServiceMapper;
import com.example.springdatajpa.entities.BookingOffice;
import com.example.springdatajpa.entities.Car;
import com.example.springdatajpa.service.Interface.IBookingOfficeService;
import com.example.springdatajpa.service.Interface.ICarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceMapper implements ICarMapper {
 @Autowired
 private ICarService iCarService;

 //Call Service to get all CarDTO
 @Override
 public List<CarDTO> viewCar() {
     List<Car> carList = iCarService.fillAllCars();
     List<CarDTO> listDTO = carList.stream()
             .map(car -> CarMapper.getCarMapper()
                     .toDTO(car)).collect(Collectors.toList());
     return listDTO;
 }

 //Call Service to get CarDTO has just been added
 @Override
 public CarDTO addCar(CarDTO carDTO, Integer pardId) {
     Car carToAdd = CarMapper.getCarMapper().toEntity(carDTO);
     return CarMapper.getCarMapper().toDTO(iCarService.addCar(carToAdd, pardId));
 }

 //Call Service to get CarDTO has just been edited
 @Override
 public CarDTO editCar(CarDTO carDTO, Integer carId, Integer parkId) {
   return null;
    // Car carToUpdate = CarMapper.getCarMapper().toEntity(carDTO);
    //  return CarMapper.getCarMapper().toDTO(iCarService.editCar(carToUpdate, carId, parkId));
 }

 //Call Service to delete Car with the given ID

@Override
public void deleteCar(Integer carId){
    // TODO Auto-generated method stub
    
}
  
}
