package com.example.springdatajpa.dto.mapper;

import com.example.springdatajpa.dto.entities.BookOfficeDTO;
import com.example.springdatajpa.entities.BookingOffice;

public class BookOfficeMapper {
    private  static BookOfficeMapper bookOfficeMapper;

    public static BookOfficeMapper getOfficeMapper() {
        if (bookOfficeMapper == null) {
            bookOfficeMapper = new BookOfficeMapper();
        }
        return bookOfficeMapper;
    }
    //Convert DTO into Entity
    public BookingOffice  toEntity(BookOfficeDTO bookOfficeDTO)
    {
        BookingOffice bookingOffice = new BookingOffice();
        // không muốn lấy id -> tạo thêm contructor>>>>>> CHƯA TẠO CONTRUCTER KO CÓ ID
        bookingOffice.setOfficeName(bookOfficeDTO.getOfficeName());
        bookingOffice.setOfficePhone(bookOfficeDTO.getOfficePhone());
        bookingOffice.setOfficePlace(bookOfficeDTO.getOfficePlace());

        bookingOffice.setOfficePrice(bookOfficeDTO.getOfficePrice());
        bookingOffice.setEndContractDeadline(bookOfficeDTO.getEndContractDeadline());
        bookingOffice.setStartContractDeadline(bookOfficeDTO.getStartContractDeadline());
        
        return bookingOffice;

    }
     //Convert Entity into DTO
     public BookOfficeDTO  toDTO(BookingOffice bookingOffice)
    {
        BookOfficeDTO bookOfficeDTO = new BookOfficeDTO();
        // không muốn lấy id -> tạo thêm contructor>>>>>> CHƯA TẠO CONTRUCTER KO CÓ ID
        bookOfficeDTO.setOfficeName(bookingOffice.getOfficeName());
        bookOfficeDTO.setOfficePhone(bookingOffice.getOfficePhone());
        bookOfficeDTO.setOfficePlace(bookingOffice.getOfficePlace());

        bookOfficeDTO.setOfficePrice(bookingOffice.getOfficePrice());
        bookOfficeDTO.setEndContractDeadline(bookingOffice.getEndContractDeadline());
        bookOfficeDTO.setStartContractDeadline(bookingOffice.getStartContractDeadline());
        
        return bookOfficeDTO;

    }
}
