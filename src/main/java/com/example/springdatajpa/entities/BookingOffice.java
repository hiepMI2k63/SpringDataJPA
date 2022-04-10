 package com.example.springdatajpa.entities;
 import javax.persistence.*;
import java.time.LocalDate;

 @Entity
 @Table(name = "booking_office")
 public class BookingOffice {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "office_id")
      private int BookingOfficeId;
      
      private LocalDate endContractDeadline;
     
      private String officeName;
     
      private String officePhone;
     
      private String officePlace;
      
      private int officePrice;
     
      private LocalDate startContractDeadline;
     @ManyToOne
     @JoinColumn(name = "trip_id",referencedColumnName = "trip_id")
     private Trip trip;

  public BookingOffice() {

  }

  public int getBookingOfficeId() {
   return BookingOfficeId;
  }

  public void setBookingOfficeId(int bookingOfficeId) {
   BookingOfficeId = bookingOfficeId;
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

  public Trip getTrip() {
   return trip;
  }

  public void setTrip(Trip trip) {
   this.trip = trip;
  }


  public BookingOffice(LocalDate endContractDeadline, String officeName, String officePhone, String officePlace,
        int officePrice, LocalDate startContractDeadline, Trip trip) {
    this.endContractDeadline = endContractDeadline;
    this.officeName = officeName;
    this.officePhone = officePhone;
    this.officePlace = officePlace;
    this.officePrice = officePrice;
    this.startContractDeadline = startContractDeadline;
    this.trip = trip;
}

public BookingOffice(int bookingOfficeId, LocalDate endContractDeadline, String officeName, String officePhone, String officePlace, int officePrice, LocalDate startContractDeadline, Trip trip) {
   BookingOfficeId = bookingOfficeId;
   this.endContractDeadline = endContractDeadline;
   this.officeName = officeName;
   this.officePhone = officePhone;
   this.officePlace = officePlace;
   this.officePrice = officePrice;
   this.startContractDeadline = startContractDeadline;
   this.trip = trip;
  }
 }
