package com.example.springdatajpa.service;
import java.util.Collections;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import com.example.springdatajpa.entities.ParkingLot;
import com.example.springdatajpa.exception.NotFoundException;
import com.example.springdatajpa.repo.*;
import com.example.springdatajpa.service.Interface.IParkingLotService;
@Service
public class ParkingLotService implements IParkingLotService {
    @Autowired
    private ParkingLotRepository parkingLotRepository;
     @Transactional
    public ParkingLot saveParkingLot(ParkingLot parkingLot) {
        return parkingLotRepository.save(parkingLot);
         
    }

    @Transactional
    public Iterable<ParkingLot> fillAll() {
            return parkingLotRepository.findAll();
    }
    @Transactional
    public ParkingLot findByParkingLotId(int ParkingLotId) {
        Optional<ParkingLot> bookResponse = parkingLotRepository.findById(ParkingLotId);
        ParkingLot parkingLot = bookResponse.get();
        return parkingLot;
    }
    

    @Transactional
    public ParkingLot deleteParkingLot(ParkingLot ParkingLot) {
        // TODO Auto-generated method stub
        return null;
    }
    @Transactional
    public int deleteParkingLotByID(int id) {
        parkingLotRepository.deleteAllById(Collections.singleton(Integer.valueOf(id)));
        return id;
    }

}
