package com.example.springdatajpa.controller;
import com.example.springdatajpa.entities.Trip;
import com.example.springdatajpa.service.Interface.ITripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/book")
public class TripController {
    @Autowired
    private ITripService bookService;
    @RequestMapping(value = "/savebook",method = RequestMethod.POST)
    @ResponseBody
    public Trip saveTrip( @Valid @RequestBody Trip book) {
        Trip bookResponse = bookService.saveTrip(book);
        return bookResponse;
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ResponseBody
    public Trip updateTrip(@RequestBody Trip book) {
        Trip bookResponse = (Trip) bookService.saveTrip(book);
        return bookResponse;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public Trip deleteTrip(@RequestBody Trip book) {
        Trip bookResponse = (Trip) bookService.deleteTrip(book);
        return bookResponse;
    }
    @RequestMapping(value = "/deleteById/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Integer deleteBookByID(@PathVariable int id) {
        Integer bookResponse =  bookService.deleteTripByID(id);
        return bookResponse;
    }

    @RequestMapping(value = "/{bookId}",method = RequestMethod.GET)
    @ResponseBody
    public Trip getTripDetails(@PathVariable int bookId) {
        Trip bookResponse = bookService.findByTripId(bookId);

        return bookResponse;
    }


}
