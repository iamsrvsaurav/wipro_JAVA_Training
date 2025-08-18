package com.example.billing_service.controller;

//package com.example.billingservice.controller;

import com.example.billing_service.entity.Bill;
import com.example.billing_service.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/bills")
public class BillingController {

    @Autowired
    private BillRepository billRepo;

    // Generate invoice (create bill)
    @PostMapping
    public Bill createBill(@RequestBody Bill bill) {
        bill.setInvoiceDate(LocalDate.now());
        if (bill.getPaid() == null) bill.setPaid(false);
        return billRepo.save(bill);
    }

    // Get by ID
    @GetMapping("/{id}")
    public Bill getBill(@PathVariable Long id) {
        return billRepo.findById(id).orElseThrow();
    }

    // List all
    @GetMapping
    public List<Bill> getAllBills() {
        return billRepo.findAll();
    }

    // List by appointment
    @GetMapping("/by-appointment/{appointmentId}")
    public List<Bill> getBillsByAppointment(@PathVariable Long appointmentId) {
        return billRepo.findByAppointmentId(appointmentId);
    }

    // List paid/unpaid bills
    @GetMapping("/by-paid/{paid}")
    public List<Bill> getBillsByPaid(@PathVariable Boolean paid) {
        return billRepo.findByPaid(paid);
    }

    // List by insurance claim number
    @GetMapping("/by-claim/{claimNumber}")
    public List<Bill> getBillsByClaim(@PathVariable String claimNumber) {
        return billRepo.findByInsuranceClaimNumber(claimNumber);
    }

    // Mark bill as paid (process payment)
    @PutMapping("/{id}/pay")
    public Bill markPaid(@PathVariable Long id, @RequestBody(required = false) Bill paymentInfo) {
        Bill bill = billRepo.findById(id).orElseThrow();
        bill.setPaid(true);
        if (paymentInfo != null) {
            bill.setPaymentMethod(paymentInfo.getPaymentMethod());
            if (paymentInfo.getInsuranceClaimNumber() != null) {
                bill.setInsuranceClaimNumber(paymentInfo.getInsuranceClaimNumber());
            }
        }
        return billRepo.save(bill);
    }

    // Update insurance claim details
    @PutMapping("/{id}/claim")
    public Bill updateClaim(@PathVariable Long id, @RequestBody Bill claimInfo) {
        Bill bill = billRepo.findById(id).orElseThrow();
        bill.setInsuranceClaimNumber(claimInfo.getInsuranceClaimNumber());
        bill.setPaymentMethod("Insurance");
        return billRepo.save(bill);
    }
}
