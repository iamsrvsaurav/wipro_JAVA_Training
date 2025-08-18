package com.example.appointment_service.dto;

//package com.example.appointmentservice.dto;

import java.time.LocalDateTime;

public class AppointmentRequest {
    private Long patientId;
    private Long doctorId;
    private LocalDateTime apptTime;

    public AppointmentRequest() {}

    public Long getPatientId() { return patientId; }
    public void setPatientId(Long patientId) { this.patientId = patientId; }
    public Long getDoctorId() { return doctorId; }
    public void setDoctorId(Long doctorId) { this.doctorId = doctorId; }
    public LocalDateTime getApptTime() { return apptTime; }
    public void setApptTime(LocalDateTime apptTime) { this.apptTime = apptTime; }
}
