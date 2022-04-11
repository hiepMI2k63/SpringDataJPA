package com.example.springdatajpa.controller;
import java.util.List;

import com.example.springdatajpa.dto.entities.CarDTO;
import com.example.springdatajpa.dto.serviceMapper.InterfaceMapper.ICarServiceMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/car")
public class CarController {
    private ICarServiceMapper iCarServiceMapper;

    public CarController( ICarServiceMapper iCarServiceMapper) {
        this.iCarServiceMapper = iCarServiceMapper;
    }

    //get all cars API
    @GetMapping
    public ResponseEntity<List<CarDTO>> getAll(CarDTO carDTO) {
        return new ResponseEntity<>(iCarServiceMapper.viewCar(), HttpStatus.OK);
    }

    //add a new car API
    @PostMapping("/{parkId}")
    private ResponseEntity<CarDTO> add(@RequestBody CarDTO carDTO,
                                    @PathVariable Integer parkId) {
        return new ResponseEntity<>(iCarServiceMapper.addCar(carDTO, parkId),
                HttpStatus.CREATED);
    }
    //update parking lot's information with a given ID
    //localhost:8080/cars/id
    // @PutMapping("/{carId}/{parkId}")
    // public ResponseEntity<CarDTO> edit(@RequestBody CarDTO carDTO,
    //                                 @PathVariable Integer carId,
    //                                 @PathVariable Integer parkId) {
    //     return new ResponseEntity<>(iCarServiceMapper.editCar(carDTO, carId, parkId),
    //             HttpStatus.OK);
    // }

    // //delete car with given ID
    // //localhost:8080/cars/id
    // @DeleteMapping("/{carId}")
    // public void delete(@PathVariable String carId) {
    //     iCarServiceMapper.deleteCar(carId);
    // }
}
