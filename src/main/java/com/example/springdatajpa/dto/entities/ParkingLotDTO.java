package com.example.springdatajpa.dto.entities;

import java.math.BigInteger;

public class ParkingLotDTO {
    private String parkArea;

    private String parkName;

    private String parkPlace;

    private BigInteger parkPrice;

    private String parkStatus;

    public ParkingLotDTO() {
    }

    public ParkingLotDTO(String parkArea, String parkName, String parkPlace, BigInteger parkPrice, String parkStatus) {
        this.parkArea = parkArea;
        this.parkName = parkName;
        this.parkPlace = parkPlace;
        this.parkPrice = parkPrice;
        this.parkStatus = parkStatus;
    }

    public String getParkArea() {
        return parkArea;
    }

    public void setParkArea(String parkArea) {
        this.parkArea = parkArea;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public String getParkPlace() {
        return parkPlace;
    }

    public void setParkPlace(String parkPlace) {
        this.parkPlace = parkPlace;
    }

    public BigInteger getParkPrice() {
        return parkPrice;
    }

    public void setParkPrice(BigInteger parkPrice) {
        this.parkPrice = parkPrice;
    }

    public String getParkStatus() {
        return parkStatus;
    }

    public void setParkStatus(String parkStatus) {
        this.parkStatus = parkStatus;
    }
    
}
