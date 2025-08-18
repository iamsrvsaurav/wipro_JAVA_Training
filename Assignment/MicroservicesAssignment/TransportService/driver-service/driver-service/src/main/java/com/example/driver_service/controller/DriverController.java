package com.example.driver_service.controller;

import com.example.driver_service.entity.Driver;
import com.example.driver_service.service.DriverService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/driver")
public class DriverController {
    private final DriverService service;

    public DriverController(DriverService service) {
        this.service = service;
    }

    @GetMapping
    public List<Driver> getAllDrivers() {
        return service.getAllDrivers();
    }

    @GetMapping("/{id}")
    public Driver getDriverById(@PathVariable Long id) {
        return service.getDriverById(id)
                .orElseThrow(() -> new RuntimeException("Driver not found"));
    }

    @PostMapping
    public Driver addDriver(@RequestBody Driver driver) {
        return service.addDriver(driver);
    }

    @PutMapping("/{id}")
    public Driver updateDriver(@PathVariable Long id, @RequestBody Driver driver) {
        return service.updateDriver(id, driver);
    }

    @DeleteMapping("/{id}")
    public String deleteDriver(@PathVariable Long id) {
        service.deleteDriver(id);
        return "Driver deleted successfully";
    }
}

