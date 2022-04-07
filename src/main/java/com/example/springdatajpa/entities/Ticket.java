package com.example.springdatajpa.entities;


import javax.persistence.*;
import java.time.LocalDate;

@Entity

@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int TicketId;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "booking_time")
    private LocalDate bookingTime;

    @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST })
    private Trip trip;
    
    @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST })
    private Car car;


    public int getTicketId() {
        return TicketId;
    }

    public void setTicketId(int ticketId) {
        TicketId = ticketId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(LocalDate bookingTime) {
        this.bookingTime = bookingTime;
    }
}
