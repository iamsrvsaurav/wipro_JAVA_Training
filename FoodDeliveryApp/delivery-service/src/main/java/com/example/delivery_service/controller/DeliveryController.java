package com.example.delivery_service.controller;

//package com.example.delivery_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.delivery_service.entity.Delivery;
import com.example.delivery_service.repository.DeliveryRepository;

@RestController
@RequestMapping("/deliveries")
public class DeliveryController {

    @Autowired
    private DeliveryRepository deliveryRepository;

    // ✅ 1. Create a delivery using JSON Body (New)
    @PostMapping
    public ResponseEntity<Delivery> createDelivery(@RequestBody Delivery delivery) {
        Delivery savedDelivery = deliveryRepository.save(delivery);
        return ResponseEntity.ok(savedDelivery);
    }

    // ✅ 2. Assign a delivery person to an order (Existing)
    @PostMapping("/assign")
    public ResponseEntity<Delivery> assignDeliveryPerson(
            @RequestParam Long orderId,
            @RequestParam String deliveryPerson) {
        Delivery delivery = new Delivery();
        delivery.setOrderId(orderId);
        delivery.setDeliveryPerson(deliveryPerson);
        delivery.setDeliveryStatus("ASSIGNED");
        Delivery savedDelivery = deliveryRepository.save(delivery);
        return ResponseEntity.ok(savedDelivery);
    }

    // ✅ 3. Update delivery status (Existing)
    @PutMapping("/{id}/status")
    public ResponseEntity<Delivery> updateDeliveryStatus(
            @PathVariable Long id,
            @RequestParam String status) {
        Delivery delivery = deliveryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Delivery not found"));
        delivery.setDeliveryStatus(status);
        return ResponseEntity.ok(deliveryRepository.save(delivery));
    }

    // ✅ 4. Get delivery by ID (New)
    @GetMapping("/{id}")
    public ResponseEntity<Delivery> getDeliveryById(@PathVariable Long id) {
        Delivery delivery = deliveryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Delivery not found"));
        return ResponseEntity.ok(delivery);
    }

    // ✅ 5. List all deliveries (New)
    @GetMapping
    public ResponseEntity<List<Delivery>> getAllDeliveries() {
        return ResponseEntity.ok(deliveryRepository.findAll());
    }
}
