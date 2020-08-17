package com.example.StudentDL.Services;

import com.example.StudentDL.Entities.Location;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ILocationService {
    Location saveLocation(Location location);
    Location updateLocation(Location location);
    void deleteLocation(Location location);
    Location getLocationById(Long id);
    List<Location> getAllLocation();
}
