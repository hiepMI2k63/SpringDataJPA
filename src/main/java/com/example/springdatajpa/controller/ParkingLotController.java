package com.example.springdatajpa.controller;
import java.util.List;

import com.example.springdatajpa.dto.entities.ParkingLotDTO;
import com.example.springdatajpa.dto.serviceMapper.InterfaceMapper.IPackingLotServiceMapper;
import com.example.springdatajpa.entities.*;
import com.example.springdatajpa.service.Interface.IParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/parking")
public class ParkingLotController {
    private IPackingLotServiceMapper iParkingLotServiceMapper;

    public ParkingLotController(
            IPackingLotServiceMapper iParkingLotServiceMapper) {
        this.iParkingLotServiceMapper = iParkingLotServiceMapper;
    }
       //get all parking lot API
       @GetMapping
       public ResponseEntity<List<ParkingLotDTO>> getAll() {
           return new ResponseEntity<>(iParkingLotServiceMapper.viewParkLot(), HttpStatus.OK);
       }
   
      // add a new parking lot API
       @PostMapping
       public ResponseEntity<ParkingLotDTO> add(@RequestBody ParkingLotDTO parkingLotDTO) {
           return new ResponseEntity<>(iParkingLotServiceMapper.addParkLot(parkingLotDTO), HttpStatus.CREATED);
       }
   
       //edit parking lot with a given ID
       @PutMapping("/{parkId}")
       public ResponseEntity<ParkingLotDTO> edit(@RequestBody ParkingLotDTO parkingLotDTO,
                                                 @PathVariable Long parkId) {
           return new ResponseEntity<>(iParkingLotServiceMapper.editParkLot(parkingLotDTO, parkId), HttpStatus.OK);
       }
   
       //delete parking lot with a given ID
       @DeleteMapping("/{parkId}")
       public void delete(@PathVariable Long parkId) {
           iParkingLotServiceMapper.deleteParkLot(parkId);
       }

}
