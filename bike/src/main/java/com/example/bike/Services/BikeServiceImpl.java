package com.example.bike.Services;

import com.example.bike.Entities.Bike;
import com.example.bike.Repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class BikeServiceImpl implements IBikeService {
    @Autowired
    private final BikeRepository bikeRepository;

    public BikeServiceImpl(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    @Override
    public List<Bike> list() {
        return (List<Bike>) bikeRepository.findAll();
    }

    @Override
    public Bike findBikeById(BigInteger id) {
        return bikeRepository.findById(id).get();
    }

    @Override
    public Bike createBike(Bike bike) {
        return bikeRepository.save(bike);
    }
}
