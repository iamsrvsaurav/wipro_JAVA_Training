package com.example.movie_ticket_booking_app.controller;

//package com.example.movieticketbookingapp.controller;

import com.example.movie_ticket_booking_app.entity.Customer;
import com.example.movie_ticket_booking_app.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getCustomers() { return customerService.getAllCustomers(); }

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable Long id) { return customerService.getCustomerById(id); }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) { return customerService.saveCustomer(customer); }

    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable Long id, @RequestBody Customer updated) {
        updated.setId(id);
        return customerService.saveCustomer(updated);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) { customerService.deleteCustomer(id); }
}
