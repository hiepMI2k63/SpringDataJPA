package com.example.springdatajpa.entities;
import javax.persistence.*;
import java.util.List;
@Entity

public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private String id;

    private String carColor;
    private String carType;
    private String company;
   
    @OneToMany(fetch= FetchType.LAZY,cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE})
    @JoinColumn(name = "car_id")
    private List<Ticket> tickets;

//    @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST })
//    private ParkingLot parkingLot;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
//
//    public ParkingLot getParkingLot() {
//        return parkingLot;
//    }
//
//    public void setParkingLot(ParkingLot parkingLot) {
//        this.parkingLot = parkingLot;
//    }

}
