package com.example.route_service.controller;

import com.example.route_service.entity.Route;
import com.example.route_service.service.RouteService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/route")
public class RouteController {
    private final RouteService service;

    public RouteController(RouteService service) {
        this.service = service;
    }

    @GetMapping
    public List<Route> all() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Route byId(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Route create(@Valid @RequestBody Route route) {
        return service.create(route);
    }

    @PutMapping("/{id}")
    public Route update(@PathVariable Long id, @Valid @RequestBody Route route) {
        return service.update(id, route);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Route deleted";
    }
}
