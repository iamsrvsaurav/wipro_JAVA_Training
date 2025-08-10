package com.example.movie_ticket_booking_app.service;

//package com.example.movieticketbookingapp.service;

import com.example.movie_ticket_booking_app.entity.Customer;
import com.example.movie_ticket_booking_app.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() { return customerRepository.findAll(); }
    public Customer getCustomerById(Long id) { return customerRepository.findById(id).orElse(null); }
    public Customer saveCustomer(Customer customer) { return customerRepository.save(customer); }
    public void deleteCustomer(Long id) { customerRepository.deleteById(id); }
}
