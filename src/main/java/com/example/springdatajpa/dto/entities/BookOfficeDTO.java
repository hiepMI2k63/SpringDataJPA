package com.example.springdatajpa.dto.entities;

import java.time.LocalDate;

public class BookOfficeDTO {
    private LocalDate endContractDeadline;

    private String officeName;

    private String officePhone;

    private String officePlace;

    private int officePrice;

    private LocalDate startContractDeadline;

    public BookOfficeDTO() {

    }

    public BookOfficeDTO(LocalDate endContractDeadline, String officeName, String officePhone, String officePlace, int officePrice, LocalDate startContractDeadline) {
        this.endContractDeadline = endContractDeadline;
        this.officeName = officeName;
        this.officePhone = officePhone;
        this.officePlace = officePlace;
        this.officePrice = officePrice;
        this.startContractDeadline = startContractDeadline;
    }

    public LocalDate getEndContractDeadline() {
        return endContractDeadline;
    }

    public void setEndContractDeadline(LocalDate endContractDeadline) {
        this.endContractDeadline = endContractDeadline;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getOfficePlace() {
        return officePlace;
    }

    public void setOfficePlace(String officePlace) {
        this.officePlace = officePlace;
    }

    public int getOfficePrice() {
        return officePrice;
    }

    public void setOfficePrice(int officePrice) {
        this.officePrice = officePrice;
    }

    public LocalDate getStartContractDeadline() {
        return startContractDeadline;
    }

    public void setStartContractDeadline(LocalDate startContractDeadline) {
        this.startContractDeadline = startContractDeadline;
    }
}
