package com.example.springdatajpa.dto.entities;

import java.time.LocalDate;

public class TicketDTO {
    private String customerName;
   
    private LocalDate bookingTime;

    public TicketDTO() {
    }

    public TicketDTO(String customerName, LocalDate bookingTime) {
        this.customerName = customerName;
        this.bookingTime = bookingTime;
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
