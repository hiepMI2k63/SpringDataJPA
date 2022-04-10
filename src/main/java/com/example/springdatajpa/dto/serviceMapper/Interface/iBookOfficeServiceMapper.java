package com.example.springdatajpa.dto.serviceMapper.Interface;

import com.example.springdatajpa.dto.entities.BookOfficeDTO;

import java.util.List;

public interface iBookOfficeServiceMapper {
    List<BookOfficeDTO> viewBookOffice();
    BookOfficeDTO addBookOffice(BookOfficeDTO bookOfficeDTO, int tripId);
    BookOfficeDTO editBookOffice(BookOfficeDTO bookOfficeDTO, int officeId, int tripId);
    void deleteBookOffice(int id);
}
