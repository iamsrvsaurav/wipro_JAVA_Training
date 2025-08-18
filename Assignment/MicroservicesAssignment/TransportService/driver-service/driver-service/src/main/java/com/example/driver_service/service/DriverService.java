package com.example.driver_service.service;

import com.example.driver_service.entity.Driver;
import com.example.driver_service.repository.DriverRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverService {
    private final DriverRepository repository;

    public DriverService(DriverRepository repository) {
        this.repository = repository;
    }

    public List<Driver> getAllDrivers() {
        return repository.findAll();
    }

    public Optional<Driver> getDriverById(Long id) {
        return repository.findById(id);
    }

    public Driver addDriver(Driver driver) {
        return repository.save(driver);
    }

    public Driver updateDriver(Long id, Driver driver) {
        return repository.findById(id).map(d -> {
            d.setName(driver.getName());
            d.setLicenseNumber(driver.getLicenseNumber());
            d.setPhoneNumber(driver.getPhoneNumber());
            d.setStatus(driver.getStatus());
            return repository.save(d);
        }).orElseThrow(() -> new RuntimeException("Driver not found"));
    }

    public void deleteDriver(Long id) {
        repository.deleteById(id);
    }
}

