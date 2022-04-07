package com.example.springdatajpa.service.Interface;

import com.example.springdatajpa.entities.ParkingLot;

public interface IParkingLotService {
    ParkingLot saveParkingLot(ParkingLot ParkingLot);
    Iterable<ParkingLot> fillAll();
    ParkingLot findByParkingLotId(int ParkingLotId);
    ParkingLot deleteParkingLot(ParkingLot ParkingLot);
    int deleteParkingLotByID(int id);
}
