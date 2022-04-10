package com.example.springdatajpa.dto.mapper;

import com.example.springdatajpa.dto.entities.ParkingLotDTO;
import com.example.springdatajpa.entities.ParkingLot;

public class ParkingLotMapper {
    public static ParkingLotMapper parkingLotMapper;

    // chưa hiểu chỗ này làm có tác dụng gì 
        public static  ParkingLotMapper getParkingLotpMapper() {
            if(parkingLotMapper == null ) {
                parkingLotMapper = new ParkingLotMapper();
            }
            return parkingLotMapper;
        }
    
        public ParkingLot toEntity( ParkingLotDTO parkingLotDTO) {
            ParkingLot parkingLot = new ParkingLot();
            parkingLot.setParkArea(parkingLotDTO.getParkArea());
            parkingLot.setParkName(parkingLotDTO.getParkName());
            parkingLot.setParkPlace(parkingLotDTO.getParkPlace());
            parkingLot.setParkPrice(parkingLotDTO.getParkPrice());
            parkingLot.setParkStatus(parkingLotDTO.getParkStatus());
           
            return parkingLot;
       
        }
        public ParkingLotDTO toDTO( ParkingLot parkingLot) {
            ParkingLotDTO parkingLotDTO = new ParkingLotDTO();
            parkingLotDTO.setParkArea(parkingLot.getParkArea());
            parkingLotDTO.setParkName(parkingLot.getParkName());
            parkingLotDTO.setParkPlace(parkingLot.getParkPlace());
            parkingLotDTO.setParkPrice(parkingLot.getParkPrice());
            parkingLotDTO.setParkStatus(parkingLot.getParkStatus());
            return parkingLotDTO;
       
        }
        
}
