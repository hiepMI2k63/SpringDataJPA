package com.example.springdatajpa.service.Interface;

import com.example.springdatajpa.entities.Trip;

public interface ITripService {
     Trip saveTrip(Trip trip);
     Trip findByTripId(int tripId);
     Trip deleteTrip(Trip trip);
     int deleteTripByID(int id);
}
