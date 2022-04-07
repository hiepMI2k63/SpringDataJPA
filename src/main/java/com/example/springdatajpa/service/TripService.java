package com.example.springdatajpa.service;
import com.example.springdatajpa.entities.Trip;
import com.example.springdatajpa.repo.TripRepository;
import com.example.springdatajpa.service.Interface.ITripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Collections;
import java.util.Optional;

@Service
public class TripService implements ITripService {
    @Autowired
    private TripRepository tripRepository;

    @Transactional
    public Trip saveTrip(Trip trip) {

        return tripRepository.save(trip);
    }

    @Transactional
    public Trip deleteTrip(Trip trip) {
        tripRepository.delete(trip);
        return trip;
    }

    @Transactional
    public int deleteTripByID(int id) {
        tripRepository.deleteAllById(Collections.singleton(Integer.valueOf(id)));
        return id;
    }

    public Trip findByTripId(int tripId) {
        Optional<Trip> tripResponse = tripRepository.findById(tripId);
        Trip trip = tripResponse.get();
        return trip;
    }
}
