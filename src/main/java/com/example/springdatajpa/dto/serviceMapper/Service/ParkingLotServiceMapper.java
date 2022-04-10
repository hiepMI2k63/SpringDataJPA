package com.example.springdatajpa.dto.serviceMapper.Service;

import java.util.List;
import java.util.stream.Collectors;

import com.example.springdatajpa.dto.entities.ParkingLotDTO;
import com.example.springdatajpa.dto.mapper.ParkingLotMapper;
import com.example.springdatajpa.dto.serviceMapper.InterfaceMapper.IPackingLotServiceMapper;
import com.example.springdatajpa.entities.ParkingLot;
import com.example.springdatajpa.service.ParkingLotService;

import org.springframework.beans.factory.annotation.Autowired;

public class ParkingLotServiceMapper implements IPackingLotServiceMapper{
@Autowired
private ParkingLotService  parkingLotService;
    @Override
    public List<ParkingLotDTO> viewParkLot() {
        List<ParkingLot> parkingLots = parkingLotService.fillAll();
        List<ParkingLotDTO> parkingLotDTOs = parkingLots.stream()
        .map(parkingLot -> ParkingLotMapper.getParkingLotpMapper()
        .toDTO(parkingLot)).collect(Collectors.toList());
        return parkingLotDTOs;
    }

    @Override
    public ParkingLotDTO addParkLot(ParkingLotDTO parkingLotDTO) {
        ParkingLot parkingLotToAdd = ParkingLotMapper.getParkingLotpMapper().toEntity(parkingLotDTO);
        return ParkingLotMapper.getParkingLotpMapper().toDTO(parkingLotService.saveParkingLot(parkingLotToAdd));

    }

    @Override
    public ParkingLotDTO editParkLot(ParkingLotDTO parkingLotDTO, Long id) {
        //  ParkingLot parkingLotToUpdate = ParkingLotMapper.getParkingLotpMapper().toEntity(parkingLotDTO);
        //         return ParkingLotMapper.getParkingLotpMapper()
        //                 .toDTO(parkingLotService.editParkLot(parkingLotToUpdate, id));
        return null;
    }

    @Override
    public void deleteParkLot(Long id) {
        // TODO Auto-generated method stub
        
    }

}
