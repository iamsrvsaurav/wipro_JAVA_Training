package com.example.appointment_service.repository;

//package com.example.appointmentservice.repository;

import com.example.appointment_service.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> { }
