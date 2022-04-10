package com.example.springdatajpa.entities;
import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @Column(name = "car_id")
    private String licensePlate;
    private String carColor;
    private String carType;
    private String company;

    @OneToMany(mappedBy = "car",cascade = CascadeType.ALL)
    private Set<Ticket> ticketSet= new HashSet<>();
    @ManyToOne
    @JoinColumn(name = "park_id",referencedColumnName = "park_id")
    private ParkingLot parkingLot;

    public Car(String licensePlate, String carColor, String carType, String company, Set<Ticket> ticketSet, ParkingLot parkingLot) {
        this.licensePlate = licensePlate;
        this.carColor = carColor;
        this.carType = carType;
        this.company = company;
        this.ticketSet = ticketSet;
        this.parkingLot = parkingLot;
    }

    public Car() {
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Set<Ticket> getTicketSet() {
        return ticketSet;
    }

    public void setTicketSet(Set<Ticket> ticketSet) {
        this.ticketSet = ticketSet;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }
}
