package com.example.springdatajpa.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import com.example.springdatajpa.entities.Ticket;
import com.example.springdatajpa.repo.TicketRepository;
import com.example.springdatajpa.service.Interface.ITicketService;
import java.util.Collections;
import java.util.Optional;
@Service
public class TicketService implements ITicketService {
    @Autowired
    private TicketRepository ticketRepository;
    @Transactional
    public Ticket saveTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }
    @Transactional
    public Ticket findByTicketId(int TicketId) {
        Optional<Ticket> TicketResponse = ticketRepository.findById(TicketId);
        Ticket Ticket = TicketResponse.get();
        return Ticket;
    }
    @Transactional
    public Ticket deleteTicket(Ticket Ticket) {
        ticketRepository.delete(Ticket);
        return Ticket;
    }

    @Transactional
    public int deleteTicketByID(int id) {
        ticketRepository.deleteAllById(Collections.singleton(Integer.valueOf(id)));
        return id;
    }
    @Transactional
    public Iterable<Ticket> fillAll() {
        return ticketRepository.findAll();
    }


}
