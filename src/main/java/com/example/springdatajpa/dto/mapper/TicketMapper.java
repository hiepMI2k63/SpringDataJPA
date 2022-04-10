package com.example.springdatajpa.dto.mapper;

import com.example.springdatajpa.dto.entities.TripDTO;
import com.example.springdatajpa.entities.Trip;

public class TripMapper {
    public static TripMapper tripMapper;

// chưa hiểu chỗ này làm có tác dụng gì 
    public static  TripMapper getTripMapper() {
        if(tripMapper == null ) {
            tripMapper = new TripMapper();
        }
        return tripMapper;
    }

    public Trip toEntity( TripDTO tripDTO) {
        Trip trip = new Trip();
        trip.setBookedTicketNumber(tripDTO.getBookedTicketNumber());
        trip.setCarType(tripDTO.getCarType());
        trip.setDepartureDate(tripDTO.getDepartureDate());
        trip.setDepartureTime(tripDTO.getDepartureTime());
        trip.setDestination(tripDTO.getDestination());
        trip.setDriver(tripDTO.getDriver());
        trip.setMaximumOnlineTicketNumber(tripDTO.getMaximumOnlineTicketNumber());
        return trip;
   
    }
    public TripDTO toDTO( Trip trip) {
        TripDTO tripDTO = new TripDTO();
      tripDTO.setBookedTicketNumber(trip.getBookedTicketNumber());
      tripDTO.setCarType(trip.getCarType());
      tripDTO.setDepartureDate(trip.getDepartureDate());
      tripDTO.setDepartureTime(trip.getDepartureTime());
      tripDTO.setDestination(trip.getDestination());
      tripDTO.setDriver(trip.getDriver());
      tripDTO.setMaximumOnlineTicketNumber(trip.getMaximumOnlineTicketNumber());
        return tripDTO;
   
    }
    
}
