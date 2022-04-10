package com.example.springdatajpa.dto.serviceMapper.InterfaceMapper;

import java.util.List;

import com.example.springdatajpa.dto.entities.TripDTO;
// SAU THỬ TẠO 1 CÁI INTERFACE TRUYỀN  GENNERIC TRUYỀN KIỂU DỮ  LÀ CÁC DTO, ENTITY( CRUD)
public interface iTripServiceMapper {
    List<TripDTO> viewTrip();
    TripDTO addTrip(TripDTO tripDTO);
    TripDTO editTrip(TripDTO tripDTO, Integer id);
    void deleteTrip(Integer id);
}
