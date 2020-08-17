package com.example.StudentDL.Services;

import com.example.StudentDL.Entities.Location;
import com.example.StudentDL.Repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements ILocationService {

    @Autowired
    private final LocationRepository locationRepository;

    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public Location saveLocation(Location location) {
        return locationRepository.save(location);
    }

    @Override
    public Location updateLocation(Location location) {
        return locationRepository.save(location);
    }

    @Override
    public void deleteLocation(Location location) {
        locationRepository.delete(location);
    }

    @Override
    public Location getLocationById(Long id) {
        return locationRepository.findById(id).get();
    }

    @Override
    public List<Location> getAllLocation() {
        return (List<Location>) locationRepository.findAll();
    }
}
