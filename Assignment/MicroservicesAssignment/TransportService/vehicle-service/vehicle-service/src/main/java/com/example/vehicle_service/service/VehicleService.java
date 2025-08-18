package com.example.vehicle_service.service;

import com.example.vehicle_service.entity.Vehicle;
import com.example.vehicle_service.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {
    private final VehicleRepository repository;

    public VehicleService(VehicleRepository repository) {
        this.repository = repository;
    }

    public List<Vehicle> getAllVehicles() {
        return repository.findAll();
    }

    public Optional<Vehicle> getVehicleById(Long id) {
        return repository.findById(id);
    }

    public Vehicle addVehicle(Vehicle vehicle) {
        return repository.save(vehicle);
    }

    public Vehicle updateVehicle(Long id, Vehicle vehicle) {
        return repository.findById(id).map(v -> {
            v.setName(vehicle.getName());
            v.setType(vehicle.getType());
            v.setCapacity(vehicle.getCapacity());
            v.setStatus(vehicle.getStatus());
            return repository.save(v);
        }).orElseThrow(() -> new RuntimeException("Vehicle not found"));
    }

    public void deleteVehicle(Long id) {
        repository.deleteById(id);
    }
}
