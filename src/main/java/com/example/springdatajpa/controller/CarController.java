package com.example.springdatajpa.controller;
import com.example.springdatajpa.entities.Car;
import com.example.springdatajpa.service.Interface.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/car")
public class CarController {
    @Autowired
    private ICarService carService;
    @RequestMapping(value = "/savecar",method = RequestMethod.POST)
    @ResponseBody
    public Car saveCar(@RequestBody Car Car) {
        Car CarResponse = carService.saveCar(Car);
        return CarResponse;
    }

}
