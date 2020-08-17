package com.example.bike.Entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

@Getter
@Setter
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Bike {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger id;
    private String name;
    private String email;
    private String phone;
    private String model;
    private String serialNumber;
    private BigDecimal purchasePrice;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy")
    private Date purchaseDate;
    private boolean contact;
}
