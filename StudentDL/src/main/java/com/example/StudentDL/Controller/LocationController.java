package com.example.StudentDL.Controller;

import com.example.StudentDL.Services.ILocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LocationController {
    @Autowired
    private final ILocationService locationService;

    public LocationController(ILocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("/create")
    public String showCreate(){
        return "createLocation";
    }
}
