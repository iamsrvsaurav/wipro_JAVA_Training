package com.example.appointment_service.controller;

import com.example.appointment_service.dto.AppointmentRequest;
import com.example.appointment_service.dto.BlockSlotRequest;
import com.example.appointment_service.feign.DoctorClient;
import com.example.appointment_service.entity.Appointment;
import com.example.appointment_service.producer.NotificationProducer;
import com.example.appointment_service.repository.AppointmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentRepository repo;
    @Autowired
    private DoctorClient doctorClient;
    @Autowired
    private NotificationProducer notificationProducer;

    @PostMapping
    @Transactional
    

    public Appointment book(@RequestBody AppointmentRequest req) {
        try {
            // 1. Block the slot in Doctor Service.
            BlockSlotRequest blockReq = new BlockSlotRequest(req.getApptTime().toString());
            doctorClient.blockSlot(req.getDoctorId(), blockReq);

            // 2. Create Appointment
            Appointment appt = new Appointment();
            appt.setPatientId(req.getPatientId());
            appt.setDoctorId(req.getDoctorId());
            appt.setApptTime(req.getApptTime());
            appt.setStatus("Booked");
            appt = repo.save(appt);

            // 3. Publish event to Kafka for notifications, etc.
            notificationProducer.sendAppointmentConfirmed(appt);

            return appt;
        } catch(Exception ex) {
            throw new RuntimeException("Booking failed, rolled back: " + ex.getMessage());
        }
    }

    @GetMapping("/{id}")
    public Appointment get(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }

    @GetMapping
    public List<Appointment> getAll() {
        return repo.findAll();
    }

    // Cancel, Reschedule, etc. endpoints can be added similarly
}
