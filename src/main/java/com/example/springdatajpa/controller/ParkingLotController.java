package com.example.springdatajpa.controller;
import com.example.springdatajpa.entities.*;
import com.example.springdatajpa.service.Interface.IParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/parkinglot")
public class ParkingLotController {
    @Autowired
    private IParkingLotService  parkingLotService;
    @RequestMapping(value = "/saveparkinglot",method = RequestMethod.POST)
    @ResponseBody
    public ParkingLot saveParkingLot(@RequestBody ParkingLot ParkingLot) {
        ParkingLot ParkingLotResponse = parkingLotService.saveParkingLot(ParkingLot);
        return ParkingLotResponse;
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ResponseBody
    public ParkingLot updateParkingLot(@RequestBody ParkingLot ParkingLot) {
        ParkingLot ParkingLotResponse = (ParkingLot) parkingLotService.saveParkingLot(ParkingLot);
        return ParkingLotResponse;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public ParkingLot deleteParkingLot(@RequestBody ParkingLot ParkingLot) {
        ParkingLot ParkingLotResponse = (ParkingLot) parkingLotService.deleteParkingLot(ParkingLot);
        return ParkingLotResponse;
    }
    @RequestMapping(value = "/deleteById/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Integer deleteParkingLotByID(@PathVariable int id) {
        Integer ParkingLotResponse =  parkingLotService.deleteParkingLotByID(id);
        return ParkingLotResponse;
    }

    @RequestMapping(value = "/{parkingLotid}",method = RequestMethod.GET)
    @ResponseBody
    public ParkingLot getParkingLotDetails(@PathVariable int ParkingLotId) {
        ParkingLot ParkingLotResponse = parkingLotService.findByParkingLotId(ParkingLotId);

        return ParkingLotResponse;
    }


}
