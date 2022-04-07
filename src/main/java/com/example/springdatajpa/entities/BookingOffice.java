 package com.example.springdatajpa.entities;
 import lombok.Data;
 import javax.persistence.*;
import java.time.LocalDate;
 @Data
 @Entity

 public class BookingOffice {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
      private int BookingOfficeId;
      
      private LocalDate endContractDeadline;
     
      private String officeName;
     
      private String officePhone;
     
      private String officePlace;
      
      private int officePrice;
     
      private LocalDate startContractDeadline;
    
      @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST })
      private Trip trip;

 }
