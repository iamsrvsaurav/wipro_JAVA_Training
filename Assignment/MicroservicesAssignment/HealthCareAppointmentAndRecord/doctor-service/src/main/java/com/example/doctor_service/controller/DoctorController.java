package com.example.doctor_service.controller;
//package com.example.doctorservice.controller;

import com.example.doctor_service.entity.Doctor;
import com.example.doctor_service.entity.BlockSlotRequest;
import com.example.doctor_service.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    @Autowired
    private DoctorRepository repo;

    private ObjectMapper objectMapper = new ObjectMapper();

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        // If no schedule provided, initialize as empty list
        if (doctor.getScheduleJson() == null) {
            doctor.setScheduleJson("[]");
        }
        return repo.save(doctor);
    }

    @GetMapping("/{id}")
    public Doctor getDoctor(@PathVariable Long id) {
        return repo.findById(id).orElseThrow(() -> new NoSuchElementException("Doctor not found"));
    }

    @GetMapping
    public List<Doctor> getAllDoctors() {
        return repo.findAll();
    }

    // Block a time slot (e.g. for appointment booking)
    @PutMapping("/{id}/block-slot")
    public Doctor blockSlot(@PathVariable Long id, @RequestBody BlockSlotRequest request) throws Exception {
        Doctor doctor = repo.findById(id).orElseThrow(() -> new NoSuchElementException("Doctor not found"));

        // Parse the schedule JSON to list
        List<String> blockedSlots;
        if (doctor.getScheduleJson() != null && !doctor.getScheduleJson().isEmpty()) {
            blockedSlots = objectMapper.readValue(doctor.getScheduleJson(), new TypeReference<List<String>>() {});
        } else {
            blockedSlots = new ArrayList<>();
        }

        // If already blocked, throw error
        if (blockedSlots.contains(request.getApptTime())) {
            throw new IllegalStateException("Slot already blocked");
        }

        // Add slot and save
        blockedSlots.add(request.getApptTime());
        doctor.setScheduleJson(objectMapper.writeValueAsString(blockedSlots));
        return repo.save(doctor);
    }
}
