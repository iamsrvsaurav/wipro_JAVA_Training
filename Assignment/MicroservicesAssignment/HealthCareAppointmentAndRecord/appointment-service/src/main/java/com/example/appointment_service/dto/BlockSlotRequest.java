package com.example.appointment_service.dto;
//package com.example.appointmentservice.dto;

public class BlockSlotRequest {
    private String apptTime; // ISO string

    public BlockSlotRequest() {}
    public BlockSlotRequest(String apptTime) { this.apptTime = apptTime; }

    public String getApptTime() { return apptTime; }
    public void setApptTime(String apptTime) { this.apptTime = apptTime; }
}
