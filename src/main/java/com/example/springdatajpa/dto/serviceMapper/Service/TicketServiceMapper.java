package com.example.springdatajpa.dto.serviceMapper.Service;

import java.util.List;
import java.util.stream.Collectors;

import com.example.springdatajpa.dto.entities.TicketDTO;
import com.example.springdatajpa.dto.mapper.TicketMapper;
import com.example.springdatajpa.dto.serviceMapper.InterfaceMapper.ITicketServiceMapper;
import com.example.springdatajpa.entities.Ticket;
import com.example.springdatajpa.service.TicketService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class TicketServiceMapper implements ITicketServiceMapper{
@Autowired
private TicketService ticketService;

@Override
public List<TicketDTO> viewTicket() {
    List<Ticket> ticketList = ticketService.fillAll();
    List<TicketDTO> listDTO = ticketList.stream()
            .map(ticket -> TicketMapper.getTicketMapper()
                    .toDTO(ticket)).collect(Collectors.toList());
    return listDTO;
}

@Override
public TicketDTO addTicket(TicketDTO ticketDTO,String licensePlate, Integer tripId) {
    Ticket ticketToAdd = TicketMapper.getTicketMapper().toEntity(ticketDTO);
    return TicketMapper.getTicketMapper().toDTO(ticketService.saveTicket(ticketToAdd, licensePlate, tripId));
}

@Override
public TicketDTO editTicket(TicketDTO ticketDTO, Integer ticketId,String licensePlate,  Integer tripId) {
    // Ticket ticketToUpdate = TicketMapper
    //         .getTicketMapper().toEntity(ticketDTO);
    //     return TicketMapper.getTicketMapper().toDTO(ticketService.editTicket(ticketToUpdate, ticketId, licensePlate, tripId));
    return null;
}

@Override
public void deleteTicket(Integer id) {
    // ticketService.deleteTicket(id);
    
    
    
}
// gọi thông qua DTO để tới service  của spring boot    
    
}
