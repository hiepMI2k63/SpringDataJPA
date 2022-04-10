package com.example.springdatajpa.controller;
import com.example.springdatajpa.dto.entities.TripDTO;
import com.example.springdatajpa.dto.serviceMapper.InterfaceMapper.iTripServiceMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "/api/v1/trip")
public class TripController {
    private iTripServiceMapper iTripServiceMapper;

    public TripController(iTripServiceMapper iTripServiceMapper) {
        this.iTripServiceMapper = iTripServiceMapper;
    }

    //get all trips API
    @GetMapping
    public ResponseEntity<List<TripDTO>> getAll() {
        return new ResponseEntity<>(iTripServiceMapper.viewTrip(), HttpStatus.OK);
    }

    //add a new trip API
    @PostMapping
    private ResponseEntity<TripDTO> add(@RequestBody TripDTO tripDTO) {
        return new ResponseEntity<>(iTripServiceMapper.addTrip(tripDTO), HttpStatus.CREATED);
    }

    //update trip's information with a given ID
    //localhost:8080/trips/id
    @PutMapping("/{tripId}")
    public ResponseEntity<TripDTO> edit(@RequestBody TripDTO tripDTO, @PathVariable Integer tripId) {
        return new ResponseEntity<>(iTripServiceMapper.editTrip(tripDTO, tripId), HttpStatus.OK);
    }

    //delete trip with given ID
    //localhost:8080/trips/id
    @DeleteMapping("/{tripId}")
    public void delete(@PathVariable Integer tripId) {
        iTripServiceMapper.deleteTrip(tripId);
    }

}
