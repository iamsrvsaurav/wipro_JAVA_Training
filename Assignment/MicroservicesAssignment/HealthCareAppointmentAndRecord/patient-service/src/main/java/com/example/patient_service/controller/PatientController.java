package com.example.patient_service.controller;

//package com.example.patientservice.controller;

import com.example.patient_service.entity.Patient;
import com.example.patient_service.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    @Autowired
    private PatientRepository repo;

    @PostMapping
    public Patient save(@RequestBody Patient patient) {
        return repo.save(patient);
    }

    @GetMapping("/{id}")
    public Patient get(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }
}
