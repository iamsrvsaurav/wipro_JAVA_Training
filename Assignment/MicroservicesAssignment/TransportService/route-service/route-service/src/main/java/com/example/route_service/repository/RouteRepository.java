package com.example.route_service.repository;

import com.example.route_service.entity.Route;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RouteRepository extends JpaRepository<Route, Long> {
    Optional<Route> findBySourceIgnoreCaseAndDestinationIgnoreCase(String source, String destination);
}
