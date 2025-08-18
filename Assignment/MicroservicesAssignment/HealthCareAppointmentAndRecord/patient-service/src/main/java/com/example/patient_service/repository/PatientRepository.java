package com.example.patient_service.repository;
//package com.example.patientservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.patient_service.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> { }
//