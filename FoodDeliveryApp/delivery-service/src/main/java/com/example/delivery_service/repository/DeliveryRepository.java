package com.example.delivery_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.delivery_service.entity.Delivery;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {}
