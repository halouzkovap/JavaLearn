package com.example.bike.Services;

import com.example.bike.Entities.Bike;

import java.math.BigInteger;
import java.util.List;

public interface IBikeService {
    List<Bike> list();

    Bike findBikeById(BigInteger id);

    Bike createBike(Bike bike);

}
