package com.example.springdatajpa.service;
import com.example.springdatajpa.exception.NotFoundException;
import com.example.springdatajpa.entities.BookingOffice;
import com.example.springdatajpa.entities.Trip;
import com.example.springdatajpa.repo.BookingOfficeRepository;
import com.example.springdatajpa.repo.TripRepository;
import com.example.springdatajpa.service.Interface.IBookingOfficeService;
import com.example.springdatajpa.service.Interface.ITripService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class BookingOfficeService implements IBookingOfficeService {

  @Autowired
  private BookingOfficeRepository bookingOfficeRepository;
  @Autowired
  private TripRepository tripRepository;
  @Autowired
  private ITripService tripService;
  @Autowired
  private IBookingOfficeService bookingOfficeService;
  @Transactional
  public BookingOffice saveBookingOffice( BookingOffice bookingOffice, int tripId ) {
    if (tripService.existedById(tripId)) {
      Trip trip = tripRepository.getById(tripId);
       bookingOffice.setTrip(trip);
   return bookingOfficeRepository.save(bookingOffice);
  } else {
      throw new NotFoundException("Trip does not exist!");
  }       
  }
  @Transactional
  public BookingOffice findByBookingOfficeId(int bookingOfficeId) {
    Optional<BookingOffice> bookResponse = bookingOfficeRepository.findById(bookingOfficeId);
    BookingOffice book = bookResponse.get();
    return book;
  }
  @Transactional
  public List<BookingOffice> fillAll() {
      return bookingOfficeRepository.findAll();
  }
  @Transactional
  public void deleteBookingOffice(Integer officeId) {
    if (bookingOfficeService.existedById(officeId)) {
      BookingOffice officeToDelete = bookingOfficeRepository.getById(officeId);
      bookingOfficeRepository.delete(officeToDelete);
  } else {
      throw new NotFoundException("Error! No office with the ID was found!");
  }
  }
  @Override
  public boolean existedById(Integer officeId) {
    return bookingOfficeRepository.existsById(officeId);
  }
  @Override
  public BookingOffice editBookOffice(BookingOffice bookingOffice, Integer officeId, Integer tripId) {
    //check if the Office exists
    if (bookingOfficeService.existedById(officeId)) {
      //check if the Trip exist
      if (tripService.existedById(tripId)) {
          Trip trip = tripRepository.getById(tripId);
          bookingOffice.setTrip(trip);
          return bookingOfficeRepository.save(bookingOffice);
      } else {
          throw new NotFoundException("Error! Trip does not exist");
      }
  } else {
      throw new NotFoundException("Error! Booking office does not exist");
  }

  }
 
 
}
