package com.example.route_service.service;

import com.example.route_service.entity.Route;
import com.example.route_service.repository.RouteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteService {
    private final RouteRepository repository;

    public RouteService(RouteRepository repository) {
        this.repository = repository;
    }

    public List<Route> getAll() {
        return repository.findAll();
    }

    public Route getById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Route not found"));
    }

    public Route create(Route route) {
        return repository.save(route);
    }

    public Route update(Long id, Route updated) {
        Route r = getById(id);
        r.setSource(updated.getSource());
        r.setDestination(updated.getDestination());
        r.setDistanceKm(updated.getDistanceKm());
        r.setEstimatedTimeMinutes(updated.getEstimatedTimeMinutes());
        r.setStatus(updated.getStatus());
        return repository.save(r);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
