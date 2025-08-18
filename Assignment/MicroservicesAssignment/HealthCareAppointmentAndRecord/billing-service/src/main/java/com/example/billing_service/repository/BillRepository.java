package com.example.billing_service.repository;

//package com.example.billingservice.repository;

import com.example.billing_service.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BillRepository extends JpaRepository<Bill, Long> {
    List<Bill> findByAppointmentId(Long appointmentId);
    List<Bill> findByPaid(Boolean paid);
    List<Bill> findByInsuranceClaimNumber(String insuranceClaimNumber);
}
