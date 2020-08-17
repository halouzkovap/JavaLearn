package com.example.bike.Contorller;

import com.example.bike.Entities.Bike;
import com.example.bike.Services.IBikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikeController {
    @Autowired
    private final IBikeService bikeService;

    public BikeController(IBikeService bikeService) {
        this.bikeService = bikeService;
    }

    @GetMapping
    public ResponseEntity<List<Bike>> list() {
        List<Bike> bikes = bikeService.list();
        return new ResponseEntity<List<Bike>>(bikes, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Bike> createBike(@RequestBody Bike bike) {
        bikeService.createBike(bike);
        return new ResponseEntity<Bike>(bike,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bike> get(@PathVariable("id") BigInteger id) {
        return new ResponseEntity<Bike>(bikeService.findBikeById(id), HttpStatus.OK);
    }
}
