package com.example.springdatajpa.service;
import java.util.List;

import com.example.springdatajpa.entities.Trip;
import com.example.springdatajpa.exception.NotFoundException;
import com.example.springdatajpa.exception.TripCapabilityException;
import com.example.springdatajpa.repo.TicketRepository;
import com.example.springdatajpa.repo.TripRepository;
import com.example.springdatajpa.service.Interface.ITripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TripService implements ITripService {
    @Autowired
    private TripRepository tripRepository;
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public List<Trip> viewTrip() {
        return tripRepository.findAll();
    }

    @Override
    public Trip addTrip(Trip trip) {
        trip.setBookedTicketNumber(0);
        return tripRepository.save(trip);
    }

    @Override
    public Trip editTrip(Trip trip, Integer tripId) {
        Trip existedTrip = tripRepository.findById(tripId).
                orElseThrow(() -> new NotFoundException("Error! No trip with the given ID was found!"));
      int   totalTicket = ticketRepository.totalTicket(tripId);
        if (totalTicket <= trip.getMaximumOnlineTicketNumber()) {
            //update trip's information
            existedTrip.setBookedTicketNumber(existedTrip.getBookedTicketNumber());
            existedTrip.setCarType(trip.getCarType());
            existedTrip.setDepartureDate(trip.getDepartureDate());
            existedTrip.setDepartureTime(trip.getDepartureTime());
            existedTrip.setDestination(trip.getDestination());
            existedTrip.setDriver(trip.getDriver());
            existedTrip.setMaximumOnlineTicketNumber(trip.getMaximumOnlineTicketNumber());
            //save to DB
            return tripRepository.save(existedTrip);
        } else {
            throw new TripCapabilityException("Error! Invalid number");
        }

    }

    @Override
    public void deleteTrip(Integer tripId) {
        //check if the trip with the given ID exists in DB
        Trip existedTrip = tripRepository.findById(tripId).
                orElseThrow(() -> new NotFoundException("Error! No trip with the given ID was found!"));
        tripRepository.delete(existedTrip);
    }

    @Override
    public boolean existedById(Integer id) {
        return tripRepository.existsById(id);
    }
}
