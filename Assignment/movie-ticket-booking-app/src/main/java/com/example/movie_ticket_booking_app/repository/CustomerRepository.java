package com.example.movie_ticket_booking_app.repository;

import com.example.movie_ticket_booking_app.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
}
