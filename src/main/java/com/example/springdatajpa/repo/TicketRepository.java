package com.example.springdatajpa.repo;

import com.example.springdatajpa.entities.Ticket;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;// sự khác nhau là gì 
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Integer>{
    @Query(value = "SELECT COUNT(*) FROM ticket u WHERE u.trip_id=?1", nativeQuery = true)
    int totalTicket(int id);
    // chưa hiểu chỗ này
}
