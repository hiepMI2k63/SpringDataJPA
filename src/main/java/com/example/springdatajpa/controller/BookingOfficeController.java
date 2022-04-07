package com.example.springdatajpa.controller;

import com.example.springdatajpa.entities.BookingOffice;
import com.example.springdatajpa.service.Interface.IBookingOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/bookingoffice")
public class BookingOfficeController {
    @Autowired
    private IBookingOfficeService BookingOfficeService;
    @RequestMapping(value = "/savebookingoffice",method = RequestMethod.POST)
    @ResponseBody
    public BookingOffice saveBookingOffice(@RequestBody BookingOffice BookingOffice) {
        BookingOffice BookingOfficeResponse = BookingOfficeService.saveBookingOffice(BookingOffice);
        return BookingOfficeResponse;
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ResponseBody
    public BookingOffice updateBookingOffice(@RequestBody BookingOffice BookingOffice) {
        BookingOffice BookingOfficeResponse = (BookingOffice) BookingOfficeService.saveBookingOffice(BookingOffice);
        return BookingOfficeResponse;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public BookingOffice deleteBookingOffice(@RequestBody BookingOffice BookingOffice) {
        BookingOffice BookingOfficeResponse = (BookingOffice) BookingOfficeService.deleteBookingOffice(BookingOffice);
        return BookingOfficeResponse;
    }
    @RequestMapping(value = "/deleteById/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Integer deleteBookingOfficeByID(@PathVariable int id) {
        Integer BookingOfficeResponse =  BookingOfficeService.deleteBookingOfficeByID(id);
        return BookingOfficeResponse;
    }

    @RequestMapping(value = "/{BookingOfficeId}",method = RequestMethod.GET)
    @ResponseBody
    public BookingOffice getBookingOfficeDetails(@PathVariable int BookingOfficeId) {
        BookingOffice BookingOfficeResponse = BookingOfficeService.findByBookingOfficeId(BookingOfficeId);

        return BookingOfficeResponse;
    }


}
