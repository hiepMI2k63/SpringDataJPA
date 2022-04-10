package com.example.springdatajpa.entities;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "parking_lot")
public class ParkingLot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "park_id")
    private int parkId;

    private String parkArea;

    private String parkName;

    private String parkPlace;

    private BigInteger parkPrice;

    private String parkStatus;

    @OneToMany(mappedBy = "parkingLot",cascade = CascadeType.ALL)
    private Set<Car> carSet = new HashSet<>();

  

    public ParkingLot(int parkId, String parkArea, String parkName, String parkPlace, BigInteger parkPrice,
            String parkStatus) {
        this.parkId = parkId;
        this.parkArea = parkArea;
        this.parkName = parkName;
        this.parkPlace = parkPlace;
        this.parkPrice = parkPrice;
        this.parkStatus = parkStatus;
    }

    public ParkingLot() {

    }


    public int getParkingLotId() {
        return parkId;
    }



    public void setParkingLotId(int parkingLotid) {
        this.parkId = parkingLotid;
    }



    public Set<Car> getCarList() {
        return carSet;
    }



    public void setCarList(Set<Car> carSet) {
        this.carSet = carSet;
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
