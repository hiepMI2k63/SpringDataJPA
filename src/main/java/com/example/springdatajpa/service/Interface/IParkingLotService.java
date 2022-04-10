package com.example.springdatajpa.service.Interface;

import java.util.List;

import com.example.springdatajpa.entities.ParkingLot;


public interface IParkingLotService {
    ParkingLot saveParkingLot(ParkingLot ParkingLot);
    List<ParkingLot> fillAll();
    ParkingLot editParkLot(ParkingLot parkingLot, Integer ParkId);
    void deleteParkingLotByID(Integer id);
    boolean existedById(Integer id);
}
