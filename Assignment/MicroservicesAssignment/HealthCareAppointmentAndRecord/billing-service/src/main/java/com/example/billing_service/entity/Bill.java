package com.example.billing_service.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long appointmentId;
    private Double amount;
    private Boolean paid;                 // Payment status
    private String paymentMethod;         // "Cash", "Credit", "Insurance", etc.
    private String insuranceClaimNumber;  // If processed via insurance

    private LocalDate invoiceDate;

    public Bill() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getAppointmentId() { return appointmentId; }
    public void setAppointmentId(Long appointmentId) { this.appointmentId = appointmentId; }
    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }
    public Boolean getPaid() { return paid; }
    public void setPaid(Boolean paid) { this.paid = paid; }
    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }
    public String getInsuranceClaimNumber() { return insuranceClaimNumber; }
    public void setInsuranceClaimNumber(String insuranceClaimNumber) { this.insuranceClaimNumber = insuranceClaimNumber; }
    public LocalDate getInvoiceDate() { return invoiceDate; }
    public void setInvoiceDate(LocalDate invoiceDate) { this.invoiceDate = invoiceDate; }
}
