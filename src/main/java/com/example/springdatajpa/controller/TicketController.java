package com.example.springdatajpa.controller;
import java.util.List;

import com.example.springdatajpa.entities.Ticket;
import com.example.springdatajpa.service.Interface.ITicketService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/ticket")
public class TicketController {
    @Autowired
    private ITicketService ticketService;
    @RequestMapping(value = "/saveticket",method = RequestMethod.POST)
    @ResponseBody
    public Ticket saveTicket(@RequestBody Ticket trip) {
        Ticket tripResponse = ticketService.saveTicket(trip);
        return tripResponse;
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ResponseBody
    public Ticket updateTicket(@RequestBody Ticket trip) {
        Ticket tripResponse = (Ticket) ticketService.saveTicket(trip);
        return tripResponse;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public Ticket deleteTicket(@RequestBody Ticket trip) {
        Ticket tripResponse = (Ticket) ticketService.deleteTicket(trip);
        return tripResponse;
    }
    @RequestMapping(value = "/deleteById/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Integer deletetripByID(@PathVariable int id) {
        Integer tripResponse =  ticketService.deleteTicketByID(id);
        return tripResponse;
    }

    @RequestMapping(value = "/{tripId}",method = RequestMethod.GET)
    @ResponseBody
    public Ticket getTicketDetails(@PathVariable int tripId) {
        Ticket tripResponse = ticketService.findByTicketId(tripId);

        return tripResponse;
    }
    @GetMapping("/getall")
    public Iterable<Ticket> getAll(){
       return ticketService.fillAll();
        
    }

}
