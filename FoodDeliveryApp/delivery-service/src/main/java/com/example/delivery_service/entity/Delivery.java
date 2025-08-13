package com.example.delivery_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long orderId;
    private String deliveryPerson;
    private String deliveryStatus; // e.g. "ASSIGNED", "IN_TRANSIT", "DELIVERED"

    // ----- Constructors -----
	/*
	 * public Delivery() { }
	 * 
	 * public Delivery(Long id, Long orderId, String deliveryPerson, String
	 * deliveryStatus) { this.id = id; this.orderId = orderId; this.deliveryPerson =
	 * deliveryPerson; this.deliveryStatus = deliveryStatus; }
	 */

    // ----- Getters -----
    public Long getId() {
        return id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public String getDeliveryPerson() {
        return deliveryPerson;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    // ----- Setters -----
    public void setId(Long id) {
        this.id = id;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setDeliveryPerson(String deliveryPerson) {
        this.deliveryPerson = deliveryPerson;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
    }
