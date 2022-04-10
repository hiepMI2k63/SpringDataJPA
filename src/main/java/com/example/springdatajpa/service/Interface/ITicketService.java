package com.example.springdatajpa.service.Interface;

import java.util.List;

import com.example.springdatajpa.entities.Ticket;


public interface ITicketService {
    List<Ticket> fillAll();
    Ticket saveTicket(Ticket Ticket, String carId, Integer tripId);
    Ticket editTicket(Ticket ticket, Integer ticketId, String carId, Integer tripId);
    void deleteTicket(Integer ticketId);
    boolean existedById(Integer id);


}
