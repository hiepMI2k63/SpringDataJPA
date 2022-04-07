package com.example.springdatajpa.service.Interface;
import com.example.springdatajpa.entities.BookingOffice;

public interface IBookingOfficeService {
        BookingOffice saveBookingOffice( BookingOffice bookingOffice);
        Iterable<BookingOffice> fillAll();
        BookingOffice findByBookingOfficeId(int bookingOfficeId);
        BookingOffice deleteBookingOffice(BookingOffice book);
        int deleteBookingOfficeByID(int id);
}
