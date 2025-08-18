package com.example.doctor_service.repository;
//package com.example.doctorservice.repository;

import com.example.doctor_service.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
