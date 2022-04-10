package com.example.springdatajpa.service.Interface;

import com.example.springdatajpa.entities.Trip;

import java.util.List;

public interface ITripService {
     List<Trip> viewTrip();
     Trip addTrip(Trip trip);
     Trip editTrip(Trip trip, Integer tripId);
     void deleteTrip(Integer tripId);
     boolean existedById(Integer id);
}
