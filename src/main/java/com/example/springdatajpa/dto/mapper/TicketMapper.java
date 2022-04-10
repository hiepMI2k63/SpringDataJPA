package com.example.springdatajpa.dto.mapper;

import com.example.springdatajpa.dto.entities.TicketDTO;
import com.example.springdatajpa.dto.entities.TripDTO;
import com.example.springdatajpa.entities.Ticket;
import com.example.springdatajpa.entities.Trip;

public class TicketMapper {
    public static TicketMapper ticketMapper;

// chưa hiểu chỗ này làm có tác dụng gì 
    public static TicketMapper getTicketMapper() {
        if(ticketMapper == null ) {
            ticketMapper = new TicketMapper();
        }
        return ticketMapper;
    }

    public Ticket toEntity( TicketDTO ticketDTO) {
       Ticket ticket = new Ticket();
       ticket.setBookingTime(ticketDTO.getBookingTime());
       ticket.setCustomerName(ticketDTO.getCustomerName());
       return ticket;
   
    }
    public TicketDTO toDTO( Ticket ticket) {
        TicketDTO ticketDTO = new TicketDTO();
        ticketDTO.setBookingTime(ticket.getBookingTime());
        ticketDTO.setCustomerName(ticket.getCustomerName());
        return ticketDTO;
    
     }
}
