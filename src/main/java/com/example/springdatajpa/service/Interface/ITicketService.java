package com.example.springdatajpa.service.Interface;

import com.example.springdatajpa.entities.Ticket;


public interface ITicketService {
    Ticket saveTicket(Ticket Ticket);
    Ticket findByTicketId(int TicketId);
    Ticket deleteTicket(Ticket Ticket);
    int deleteTicketByID(int id);
    Iterable<Ticket> fillAll();
}
