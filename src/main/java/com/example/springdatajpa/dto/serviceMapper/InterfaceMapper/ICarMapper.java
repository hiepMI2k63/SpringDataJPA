package com.example.springdatajpa.dto.serviceMapper.InterfaceMapper;

import java.util.List;

import com.example.springdatajpa.dto.entities.BookOfficeDTO;

public interface iBookOfficeServiceMapper {
    List<BookOfficeDTO> viewBookOffice();
    BookOfficeDTO addBookOffice(BookOfficeDTO bookOfficeDTO, Integer tripId);
    BookOfficeDTO editBookOffice(BookOfficeDTO bookOfficeDTO, Integer officeId, Integer tripId);
    void deleteBookOffice(Integer id);
}
