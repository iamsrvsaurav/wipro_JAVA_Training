package com.example.booking_service.client;

import com.example.booking_service.dto.DriverDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "driver-service")
public interface DriverClient {
    @GetMapping("/driver/{id}")
    DriverDTO getDriver(@PathVariable("id") Long id);
}
