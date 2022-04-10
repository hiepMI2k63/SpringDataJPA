package com.example.springdatajpa.dto.serviceMapper.InterfaceMapper;
import java.util.List;

import com.example.springdatajpa.dto.entities.ParkingLotDTO;

public interface IPackingLotServiceMapper {
    List<ParkingLotDTO> viewParkLot();
    ParkingLotDTO addParkLot(ParkingLotDTO parkingLotDTO);
    ParkingLotDTO editParkLot(ParkingLotDTO parkingLotDTO, Long id);
    void deleteParkLot(Long id);
}
