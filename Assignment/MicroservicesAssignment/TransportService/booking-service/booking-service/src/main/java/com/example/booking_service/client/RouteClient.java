package com.example.booking_service.client;

import com.example.booking_service.dto.RouteDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "route-service")
public interface RouteClient {
    @GetMapping("/route/{id}")
    RouteDTO getRoute(@PathVariable("id") Long id);
}
