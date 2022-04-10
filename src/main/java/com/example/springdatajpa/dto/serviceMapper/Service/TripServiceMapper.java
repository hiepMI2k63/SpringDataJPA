package com.example.springdatajpa.dto.serviceMapper.Service;

import java.util.List;
import java.util.stream.Collectors;

import com.example.springdatajpa.dto.entities.TripDTO;
import com.example.springdatajpa.dto.mapper.TripMapper;
import com.example.springdatajpa.dto.serviceMapper.InterfaceMapper.iTripServiceMapper;
import com.example.springdatajpa.entities.Trip;
import com.example.springdatajpa.service.Interface.ITripService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class TripServiceMapper implements iTripServiceMapper{
@Autowired
private ITripService iTripService;
	@Override
	public List<TripDTO> viewTrip() {
        List<Trip> listTrips = iTripService.viewTrip();
        List<TripDTO> listDTO = listTrips.stream()
                .map(trip -> TripMapper.getTripMapper()
                        .toDTO(trip)).collect(Collectors.toList());
        return listDTO;
	}

	@Override
    public TripDTO addTrip(TripDTO tripDTO) {
        Trip tripToAdd = TripMapper.getTripMapper().toEntity(tripDTO);
        return TripMapper.getTripMapper().toDTO(iTripService.addTrip(tripToAdd));
	}

	@Override
	public TripDTO editTrip(TripDTO tripDTO, Integer tripId) {
        Trip tripToUpdate = TripMapper.getTripMapper().toEntity(tripDTO);
        return TripMapper.getTripMapper().toDTO(iTripService.editTrip(tripToUpdate, tripId));
    }
	@Override
	public void deleteTrip(Integer id) {
        iTripService.deleteTrip(id);
		
	}
    
}
