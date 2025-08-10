package com.example.movie_ticket_booking_app.service;

//package com.example.movieticketbookingapp.service;

import com.example.movie_ticket_booking_app.entity.Booking;
import com.example.movie_ticket_booking_app.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public List<Booking> getAllBookings() { return bookingRepository.findAll(); }
    public Booking getBookingById(Long id) { return bookingRepository.findById(id).orElse(null); }
    public Booking saveBooking(Booking booking) { return bookingRepository.save(booking); }
    public void deleteBooking(Long id) { bookingRepository.deleteById(id); }
    public List<Booking> getBookingsByCustomer(Long customerId) {
        return bookingRepository.findByCustomerId(customerId);
    }
}
