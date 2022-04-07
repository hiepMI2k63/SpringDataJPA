package com.example.springdatajpa.entities;

import lombok.Data;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Data
public class ParkingLot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int parkingLotId;

    private String parkArea;

    private String parkName;

    private String parkPlace;

    private BigInteger parkPrice;

    private String parkStatus;

    @OneToMany(fetch= FetchType.LAZY,cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE})
    @JoinColumn(name = "parkingLotId")
    List<Car> carList;

  

    public ParkingLot(int parkingLotid, String parkArea, String parkName, String parkPlace, BigInteger parkPrice,
            String parkStatus) {
        this.parkingLotId = parkingLotid;
        this.parkArea = parkArea;
        this.parkName = parkName;
        this.parkPlace = parkPlace;
        this.parkPrice = parkPrice;
        this.parkStatus = parkStatus;
    }

    public ParkingLot() {

    }


    public int getParkingLotId() {
        return parkingLotId;
    }



    public void setParkingLotId(int parkingLotid) {
        this.parkingLotId = parkingLotid;
    }



    public List<Car> getCarList() {
        return carList;
    }



    public void setCarList(List<Car> carList) {
        this.carList = carList;
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
