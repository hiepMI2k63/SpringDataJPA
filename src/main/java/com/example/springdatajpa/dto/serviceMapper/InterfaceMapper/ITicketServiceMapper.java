package com.example.springdatajpa.dto.serviceMapper.InterfaceMapper;

import com.example.springdatajpa.dto.entities.TicketDTO;

import java.util.List;

public interface ITicketServiceMapper {
    List<TicketDTO> viewTicket();
    TicketDTO addTicket(TicketDTO TicketDTO,String licensePlate, Integer tripId);
    TicketDTO editTicket(TicketDTO TicketDTO, Integer ticketId,String licensePlate,  Integer tripId);
    void deleteTicket(Integer Ticketid);
}
