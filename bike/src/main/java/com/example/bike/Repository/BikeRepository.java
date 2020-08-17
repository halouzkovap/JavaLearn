package com.example.bike.Repository;

import com.example.bike.Entities.Bike;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface BikeRepository extends CrudRepository<Bike, BigInteger> {

}
