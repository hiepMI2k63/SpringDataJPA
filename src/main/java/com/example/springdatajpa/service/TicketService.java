package com.example.springdatajpa.service;
import com.example.springdatajpa.exception.NotFoundException;
import com.example.springdatajpa.exception.TripCapabilityException;
import com.example.springdatajpa.repo.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.transaction.Transactional;
import com.example.springdatajpa.entities.Car;
import com.example.springdatajpa.entities.Ticket;
import com.example.springdatajpa.entities.Trip;
import com.example.springdatajpa.repo.TicketRepository;
import com.example.springdatajpa.repo.TripRepository;
import com.example.springdatajpa.service.Interface.ICarService;
import com.example.springdatajpa.service.Interface.ITicketService;
import com.example.springdatajpa.service.Interface.ITripService;

@Service
public class TicketService implements ITicketService {
    private TicketRepository ticketRepository;
    private CarRepository carRepository;
    private TripRepository tripRepository;
    private ITripService itripService;
    private ICarService icarService;

    public TicketService(TicketRepository ticketRepository,
            CarRepository carRepository,
            TripRepository tripRepository,
            ITripService itripService,
            ICarService icarService) {
        this.ticketRepository = ticketRepository;
        this.carRepository = carRepository;
        this.tripRepository = tripRepository;
        this.itripService = itripService;
        this.icarService = icarService;
    }

    @Transactional
    public Ticket saveTicket(Ticket ticket, String licensePlate, Integer tripId) {
        if (icarService.existedById(licensePlate)) {
            Car car = carRepository.getById(licensePlate);
            ticket.setCar(car);
            // check if the trip exists in DB
            if (itripService.existedById(tripId)) {
                // get the trip to validate information
                Trip trip = tripRepository.getById(tripId);
                // check if the number of booked tickets is valid
                if (trip.getBookedTicketNumber() < trip.getMaximumOnlineTicketNumber()) {
                    ticket.setTrip(trip);
                    // increase the number of booked tickets by 1 and update to DB
                    trip.setBookedTicketNumber(trip.getBookedTicketNumber() + 1);
                    tripRepository.save(trip);
                    return ticketRepository.save(ticket);
                } else {
                    throw new TripCapabilityException("Error! Trip has been full!");
                }
            } else {
                throw new NotFoundException("Error! No trip with the ID was found!");
            }
        } else {
            throw new NotFoundException("Error! No car with the license plate was found!");
        }
    }

    @Override
    public Ticket editTicket(Ticket ticket, Integer ticketId, String carId, Integer tripId) {
            //check if the ticket exists in DB
            if (this.existedById(ticketId)) {
                //check if the car exists in DB
                if (icarService.existedById(carId)) {
                    //check if the trip exists in DB
                    if (itripService.existedById(tripId)) {
                        //get the trip to check
                        Trip trip = tripRepository.getById(tripId);
                        Car car = carRepository.getById(carId);
                        //check if the trip is still available for booking
                        if (trip.getBookedTicketNumber() < trip.getMaximumOnlineTicketNumber()) {
                            //update ticket's information
                            Ticket ticketToUpdate = ticketRepository.getById(ticketId);
                            ticketToUpdate.setBookingTime(ticket.getBookingTime());
                            ticketToUpdate.setCustomerName(ticket.getCustomerName());
                            ticketToUpdate.setTrip(trip);
                            ticketToUpdate.setCar(car);
                            //save to DB
                            return ticketRepository.save(ticketToUpdate);
                        } else {
                            throw new TripCapabilityException("Error! The trip has been full!");
                        }
                    } else {
                        throw new NotFoundException("Error! No trip with the ID was found!");
                    }
                } else {
                    throw new NotFoundException("Error! No car with the ID was found!");
                }
            } else {
                throw new NotFoundException("Error! No ticket with the ID was found!");
            }
    }

    @Transactional
    public List<Ticket> fillAll() {
        return ticketRepository.findAll();
    }

    @Override
    public void deleteTicket(Integer ticketId) {

        // check if the ticket exists in DB
        Ticket ticketToDelete = ticketRepository.findById(ticketId)
                .orElseThrow(() -> new NotFoundException("Error! No ticket with the ID was found!"));

        Trip tripToUpdate = tripRepository.getById(ticketToDelete.getTrip().getTripId());
        tripToUpdate.setBookedTicketNumber(tripToUpdate.getBookedTicketNumber() - 1);

        tripRepository.save(tripToUpdate);
        ticketRepository.delete(ticketToDelete);
    }

    @Override
    public boolean existedById(Integer id) {
        return ticketRepository.existsById(id);
    }

}
