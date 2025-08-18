package com.example.booking_service.controller;

import com.example.booking_service.entity.Booking;
import com.example.booking_service.service.BookingService;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/booking")
public class BookingController {

    private final BookingService service;
    public BookingController(BookingService service) { this.service = service; }

    @GetMapping
    public List<Booking> all() { return service.all(); }

    @GetMapping("/{id}")
    public Booking byId(@PathVariable Long id) { return service.byId(id); }

    @PostMapping
    public Booking create(@RequestParam Long vehicleId,
                          @RequestParam Long driverId,
                          @RequestParam Long routeId,
                          @RequestParam @NotBlank String customerName,
                          @RequestParam @Min(1) Integer passengerCount) {
        return service.create(vehicleId, driverId, routeId, customerName, passengerCount);
    }

    @PostMapping("/{id}/cancel")
    public Booking cancel(@PathVariable Long id) { return service.cancel(id); }

    @GetMapping("/{id}/details")
    public Map<String, Object> details(@PathVariable Long id) { return service.details(id); }
}
