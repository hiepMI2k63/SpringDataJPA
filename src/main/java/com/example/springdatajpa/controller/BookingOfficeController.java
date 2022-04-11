package com.example.springdatajpa.controller;

import com.example.springdatajpa.dto.entities.BookOfficeDTO;
import com.example.springdatajpa.dto.serviceMapper.InterfaceMapper.iBookOfficeServiceMapper;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = "api/v1/bookingoffice")
public class BookingOfficeController {

    private iBookOfficeServiceMapper iBookOfficeServiceMapper;

    public BookingOfficeController(iBookOfficeServiceMapper iBookOfficeServiceMapper) {
        this.iBookOfficeServiceMapper = iBookOfficeServiceMapper;
    }
    @GetMapping
    public ResponseEntity<List<BookOfficeDTO>> getAll(BookOfficeDTO bookOfficeDTO) {
        return new ResponseEntity<>(iBookOfficeServiceMapper.viewBookOffice(), HttpStatus.OK);
    }

        //add a new booking office API
        @PostMapping("/{tripId}")
        private ResponseEntity<BookOfficeDTO> add(@RequestBody BookOfficeDTO bookOfficeDTO,
                                                @PathVariable Integer tripId) {
            return new ResponseEntity<>(iBookOfficeServiceMapper.addBookOffice(bookOfficeDTO, tripId),
                    HttpStatus.CREATED);
        }
}
