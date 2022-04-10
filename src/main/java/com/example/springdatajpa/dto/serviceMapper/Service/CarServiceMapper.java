package com.example.springdatajpa.dto.serviceMapper.Service;

import java.util.List;

import com.example.springdatajpa.dto.entities.BookOfficeDTO;
import com.example.springdatajpa.dto.mapper.BookOfficeMapper;
import com.example.springdatajpa.dto.serviceMapper.InterfaceMapper.iBookOfficeServiceMapper;
import com.example.springdatajpa.entities.BookingOffice;
import com.example.springdatajpa.service.Interface.IBookingOfficeService;

import org.springframework.stereotype.Component;
import java.util.stream.Collectors;

@Component
public class BookOfficeServiceMapper implements iBookOfficeServiceMapper {
    private IBookingOfficeService iBookOfficeService;

    public BookOfficeServiceMapper(IBookingOfficeService iBookOfficeService) {
        this.iBookOfficeService = iBookOfficeService;
    }
    @Override
    public List<BookOfficeDTO> viewBookOffice() {
        List<BookingOffice> bookingOfficeList = iBookOfficeService.fillAll();
        List<BookOfficeDTO> listDTO = bookingOfficeList.stream()
                .map(bookingOffice -> BookOfficeMapper.getOfficeMapper()
                        .toDTO(bookingOffice)).collect(Collectors.toList());
        return listDTO;
    }

    @Override
    public BookOfficeDTO addBookOffice(BookOfficeDTO bookOfficeDTO, Integer tripId) {
        BookingOffice bookingOfficeToAdd = BookOfficeMapper.getOfficeMapper().toEntity(bookOfficeDTO);
        return BookOfficeMapper.getOfficeMapper()
        .toDTO(iBookOfficeService.saveBookingOffice(bookingOfficeToAdd, tripId));
    
    }

    @Override
    public BookOfficeDTO editBookOffice(BookOfficeDTO bookOfficeDTO, Integer officeId, Integer tripId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteBookOffice(Integer id) {
        // TODO Auto-generated method stub
        
    }
   
  
}
