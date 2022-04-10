package com.example.springdatajpa.entities;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "trip")
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trip_id")
    private Integer tripId;
    
   
    private String carType;
    @NotNull
    private String departureDate;

    private String departureTime;

    private String destination;

    private String driver;

    private int maximumOnlineTicketNumber;

    private int bookedTicketNumber;

    @OneToMany(mappedBy = "trip",cascade = CascadeType.ALL)
     private Set<Ticket> ticketSet = new HashSet<>();
    @OneToMany(mappedBy = "trip",cascade = CascadeType.ALL)
    private Set<BookingOffice> bookingOfficesSet= new HashSet<>();

    public Trip() {

    }

    public Trip(Integer tripId, String carType, @NotNull String departureDate, String departureTime, String destination,
            String driver, int maximumOnlineTicketNumber, int bookedTicketNumber, Set<Ticket> ticketSet,
            Set<BookingOffice> bookingOfficesSet) {
        this.tripId = tripId;
        this.carType = carType;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.destination = destination;
        this.driver = driver;
        this.maximumOnlineTicketNumber = maximumOnlineTicketNumber;
        this.bookedTicketNumber = bookedTicketNumber;
        this.ticketSet = ticketSet;
        this.bookingOfficesSet = bookingOfficesSet;
    }

    public Integer getTripId() {
        return tripId;
    }

    public void setTripId(Integer tripId) {
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

    public Set<Ticket> getTicketSet() {
        return ticketSet;
    }

    public void setTicketSet(Set<Ticket> ticketSet) {
        this.ticketSet = ticketSet;
    }

    public Set<BookingOffice> getBookingOfficesSet() {
        return bookingOfficesSet;
    }

    public void setBookingOfficesSet(Set<BookingOffice> bookingOfficesSet) {
        this.bookingOfficesSet = bookingOfficesSet;
    }

}
