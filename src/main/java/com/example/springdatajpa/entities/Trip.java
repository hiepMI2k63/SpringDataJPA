package com.example.springdatajpa.entities;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int tripId;

    private String carType;
    @NotNull
    private String departureDate;

    private String departureTime;

    private String destination;

    private String driver;

    private int maximumOnlineTicketNumber;

    private int bookedTicketNumber;

    @OneToMany(fetch= FetchType.LAZY,cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE})
     @JoinColumn(name = "trip_id")
     List<Ticket> ticketList;

//    @OneToMany(fetch= FetchType.LAZY,cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE})
//
//    List<BookingOffice> bookingOffices;

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public int getMaximumOnlineTicketNumber() {
        return maximumOnlineTicketNumber;
    }

    public void setMaximumOnlineTicketNumber(int maximumOnlineTicketNumber) {
        this.maximumOnlineTicketNumber = maximumOnlineTicketNumber;
    }

    public int getBookedTicketNumber() {
        return bookedTicketNumber;
    }

    public void setBookedTicketNumber(int bookedTicketNumber) {
        this.bookedTicketNumber = bookedTicketNumber;
    }

    
}
