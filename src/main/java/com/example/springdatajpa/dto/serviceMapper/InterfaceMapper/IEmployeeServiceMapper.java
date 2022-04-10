package com.example.springdatajpa.dto.serviceMapper.InterfaceMapper;

import com.example.springdatajpa.dto.entities.BookOfficeDTO;

import java.util.List;

public interface IEmployeeServiceMapper {
    List<BookOfficeDTO> viewBookOffice();
    BookOfficeDTO addBookOffice(BookOfficeDTO bookOfficeDTO, Integer tripId);
    BookOfficeDTO editBookOffice(BookOfficeDTO bookOfficeDTO, Integer officeId, Integer tripId);
    void deleteBookOffice(Integer id);
}
