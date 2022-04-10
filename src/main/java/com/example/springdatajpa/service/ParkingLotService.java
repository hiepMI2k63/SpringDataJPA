package com.example.springdatajpa.service;
import java.util.List;
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

    public ParkingLot saveParkingLot(ParkingLot parkingLot) {
        return parkingLotRepository.save(parkingLot);

    }

    @Transactional
    public List<ParkingLot> fillAll() {
        return parkingLotRepository.findAll();
    }

    @Transactional
    public ParkingLot findByParkingLotId(int ParkingLotId) {
        Optional<ParkingLot> bookResponse = parkingLotRepository.findById(ParkingLotId);
        ParkingLot parkingLot = bookResponse.get();
        return parkingLot;
    }

    @Override
    public boolean existedById(Integer id) {

        return parkingLotRepository.existsById(id);
    }

    @Override
    public ParkingLot editParkLot(ParkingLot parkingLot, Integer ParkId) {
        // check if the parking lot exists in DB
        ParkingLot parkToUpdate = parkingLotRepository.findById(ParkId)
                .orElseThrow(() -> new NotFoundException("Error! No parking lot with the ID was found!"));
        // update information
        parkToUpdate.setParkArea(parkToUpdate.getParkArea());
        parkToUpdate.setParkName(parkToUpdate.getParkName());
        parkToUpdate.setParkPlace(parkToUpdate.getParkPlace());
        parkToUpdate.setParkPrice(parkToUpdate.getParkPrice());
        parkToUpdate.setParkStatus(parkToUpdate.getParkStatus());
        // save to DB
        return parkingLotRepository.save(parkToUpdate);
    }

    @Override
    public void deleteParkingLotByID(Integer parkId) {
        ParkingLot parkToDelete = parkingLotRepository.findById(parkId)
                .orElseThrow(() -> new NotFoundException("Error! No parking lot with the ID was found!"));
        parkingLotRepository.delete(parkToDelete);
    }

}
