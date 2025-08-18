package com.example.doctor_service.entity;

//package com.example.doctorservice.model;

public class BlockSlotRequest {
    private String apptTime; // ISO timestamp string for appointment

    public BlockSlotRequest() {}

    public BlockSlotRequest(String apptTime) {
        this.apptTime = apptTime;
    }

    public String getApptTime() { return apptTime; }
    public void setApptTime(String apptTime) { this.apptTime = apptTime; }
}
