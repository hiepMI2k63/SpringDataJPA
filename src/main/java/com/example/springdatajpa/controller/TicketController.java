package com.example.springdatajpa.controller;
import java.util.List;

import com.example.springdatajpa.dto.entities.TicketDTO;
import com.example.springdatajpa.dto.serviceMapper.InterfaceMapper.ITicketServiceMapper;
import com.example.springdatajpa.entities.Ticket;
import com.example.springdatajpa.service.Interface.ITicketService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/ticket")
public class TicketController {
    private ITicketServiceMapper iTicketServiceMapper;

    public TicketController(ITicketServiceMapper iTicketServiceMapper) {
        this.iTicketServiceMapper = iTicketServiceMapper;
    }

    //get all tickets API
    @GetMapping
    public ResponseEntity<List<TicketDTO>> getAll() {
        return new ResponseEntity<>(iTicketServiceMapper.viewTicket(), HttpStatus.OK);
    }

    //add a new ticket API
    //localhost:8080/tickets/carId/tripId
    @PostMapping("/{carId}/{tripId}")
    public ResponseEntity<TicketDTO> add(@RequestBody TicketDTO ticketDTO,
                                         @PathVariable String carId,
                                         @PathVariable Integer tripId) {
        return new ResponseEntity<>(iTicketServiceMapper.addTicket(ticketDTO, carId, tripId),
                HttpStatus.CREATED);
    }

    //update ticket's information with a given ID
    //localhost:8080/tickets/id
    @PutMapping("/{ticketId}/{carId}/{tripId}")
    public ResponseEntity<TicketDTO> edit(@RequestBody TicketDTO ticketDTO,
                                          @PathVariable Integer ticketId,
                                          @PathVariable String carId,
                                          @PathVariable Integer tripId) {
        return new ResponseEntity<>(iTicketServiceMapper.editTicket(ticketDTO, ticketId, carId, tripId),
                HttpStatus.OK);
    }

    //delete ticket with given ID
    //localhost:8080/tickets/id
    @DeleteMapping("/{ticketId}")
    public void delete(@PathVariable Integer ticketId) {
        iTicketServiceMapper.deleteTicket(ticketId);
    }
}
