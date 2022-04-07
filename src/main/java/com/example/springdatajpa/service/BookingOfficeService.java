package com.example.springdatajpa.service;

import com.example.springdatajpa.entities.BookingOffice;
import com.example.springdatajpa.repo.BookingOfficeRepository;
import com.example.springdatajpa.service.Interface.IBookingOfficeService;
import org.springframework.stereotype.Service;

import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class BookingOfficeService implements IBookingOfficeService {

  @Autowired BookingOfficeRepository bookingOfficeRepository;
  @Transactional
  public BookingOffice saveBookingOffice( BookingOffice bookingOffice ) {
            bookingOffice = bookingOfficeRepository.save(bookingOffice);
            return bookingOffice;
  }
  @Transactional
  public BookingOffice findByBookingOfficeId(int bookingOfficeId) {
    Optional<BookingOffice> bookResponse = bookingOfficeRepository.findById(bookingOfficeId);
    BookingOffice book = bookResponse.get();
    return book;
  }

  @Transactional
  public Iterable<BookingOffice> fillAll() {
      return bookingOfficeRepository.findAll();
  }

  @Transactional
  public BookingOffice deleteBookingOffice(BookingOffice book) {
    // TODO Auto-generated method stub
    return null;
  }
  @Transactional
  public int deleteBookingOfficeByID(int id) {
    // TODO Auto-generated method stub
    return 0;
  }


 
}
