package com.example.movie_ticket_booking_app.repository;



import com.example.movie_ticket_booking_app.entity.Booking;
//import com.example.movie_ticket_booking_app.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;



import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByCustomerId(Long customerId);
}
