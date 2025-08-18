package com.example.appointment_service.feign;

import com.example.appointment_service.dto.BlockSlotRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "doctor-service", url = "http://localhost:6062/api/doctors")
public interface DoctorClient {
    @PutMapping("/{id}/block-slot")
    void blockSlot(@PathVariable("id") Long id, @RequestBody BlockSlotRequest request);
}
