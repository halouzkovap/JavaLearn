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
@CrossOrigin(origins = "http://localhost:4200")
public class BikeController {
    @Autowired
    private final IBikeService bikeService;

    public BikeController(IBikeService bikeService) {
        this.bikeService = bikeService;
    }

    @GetMapping
    public List<Bike> list() {
        List<Bike> bikes = bikeService.list();
        return bikes;
    }

    @PostMapping
    public ResponseEntity<Bike> createBike(@RequestBody Bike bike) {
        bikeService.createBike(bike);
        return  ResponseEntity.ok().body(bike);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bike> get(@PathVariable("id") BigInteger id) {
        return new ResponseEntity<Bike>(bikeService.findBikeById(id), HttpStatus.OK);
    }
}
