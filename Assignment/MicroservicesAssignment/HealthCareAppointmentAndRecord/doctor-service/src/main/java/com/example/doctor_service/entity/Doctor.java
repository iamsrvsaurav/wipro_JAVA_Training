package com.example.doctor_service.entity;
//package com.example.doctorservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String specialization;

    // Store schedule as a JSON array (e.g. ["2025-08-16T14:00:00", ...])
    @Column(columnDefinition = "TEXT")
    private String scheduleJson;

    public Doctor() {}

    public Doctor(String name, String specialization, String scheduleJson) {
        this.name = name;
        this.specialization = specialization;
        this.scheduleJson = scheduleJson;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }
    public String getScheduleJson() { return scheduleJson; }
    public void setScheduleJson(String scheduleJson) { this.scheduleJson = scheduleJson; }
}

