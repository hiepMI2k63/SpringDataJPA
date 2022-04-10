package com.example.springdatajpa.service.Interface;
import java.util.List;

import com.example.springdatajpa.entities.BookingOffice;

public interface IBookingOfficeService {
        BookingOffice saveBookingOffice( BookingOffice bookingOffice,int  tripId);
        List<BookingOffice> fillAll();
        BookingOffice findByBookingOfficeId(int bookingOfficeId);
        void deleteBookingOffice(Integer officeId);
        boolean existedById(Integer id);
        BookingOffice editBookOffice(BookingOffice bookingOffice, Integer officeId, Integer tripId);
}
