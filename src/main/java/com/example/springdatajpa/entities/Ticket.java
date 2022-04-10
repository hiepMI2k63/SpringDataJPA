package com.example.springdatajpa.entities;


import javax.persistence.*;
import java.time.LocalDate;

@Entity

@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id")
    private int TicketId;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "booking_time")
    private LocalDate bookingTime;
    @ManyToOne
    @JoinColumn(name = "trip_id",referencedColumnName = "trip_id")
    private Trip trip;
    @ManyToOne
    @JoinColumn(name = "car_id",referencedColumnName = "car_id")
    private Car car;

    public Ticket(int ticketId, String customerName, LocalDate bookingTime, Trip trip, Car car) {
        TicketId = ticketId;
        this.customerName = customerName;
        this.bookingTime = bookingTime;
        this.trip = trip;
        this.car = car;
    }

    public Ticket() {

    }

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

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
