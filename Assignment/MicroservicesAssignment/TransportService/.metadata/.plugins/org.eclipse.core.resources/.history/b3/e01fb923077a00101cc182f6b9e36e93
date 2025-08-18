package com.example.route_service.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "routes")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // works with Postgres as identity
    private Long id;

    @NotBlank
    @Column(nullable = false)
    private String source;

    @NotBlank
    @Column(nullable = false)
    private String destination;

    @Min(0)
    private Integer distanceKm;

    @Min(0)
    private Integer estimatedTimeMinutes;

    private String status; // e.g., Active / Inactive

    public Route() {}

    public Route(String source, String destination, Integer distanceKm, Integer estimatedTimeMinutes, String status) {
        this.source = source;
        this.destination = destination;
        this.distanceKm = distanceKm;
        this.estimatedTimeMinutes = estimatedTimeMinutes;
        this.status = status;
    }

    // getters/setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }
    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }
    public Integer getDistanceKm() { return distanceKm; }
    public void setDistanceKm(Integer distanceKm) { this.distanceKm = distanceKm; }
    public Integer getEstimatedTimeMinutes() { return estimatedTimeMinutes; }
    public void setEstimatedTimeMinutes(Integer estimatedTimeMinutes) { this.estimatedTimeMinutes = estimatedTimeMinutes; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
