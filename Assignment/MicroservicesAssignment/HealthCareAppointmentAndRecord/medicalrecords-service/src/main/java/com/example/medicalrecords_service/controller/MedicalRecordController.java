package com.example.medicalrecords_service.controller;

//package com.example.medicalrecords.controller;

import com.example.medicalrecords_service.entity.MedicalRecord;
import com.example.medicalrecords_service.repository.MedicalRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medical-records")
public class MedicalRecordController {

    @Autowired
    private MedicalRecordRepository repo;

    // Create
    @PostMapping
    public MedicalRecord createRecord(@RequestBody MedicalRecord record) {
        return repo.save(record);
    }

    // Get by ID
    @GetMapping("/{id}")
    public MedicalRecord getRecord(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }

    // Get all for a patient
    @GetMapping("/by-patient/{patientId}")
    public List<MedicalRecord> getRecordsByPatient(@PathVariable Long patientId) {
        return repo.findByPatientId(patientId);
    }

    // Get all for a doctor
    @GetMapping("/by-doctor/{doctorId}")
    public List<MedicalRecord> getRecordsByDoctor(@PathVariable Long doctorId) {
        return repo.findByDoctorId(doctorId);
    }

    // List all
    @GetMapping
    public List<MedicalRecord> getAllRecords() {
        return repo.findAll();
    }
}
