package com.example.movie_ticket_booking_app.controller;

//package com.example.movieticketbookingapp.controller;

import com.example.movie_ticket_booking_app.entity.Booking;
import com.example.movie_ticket_booking_app.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping
    public List<Booking> getAll() { return bookingService.getAllBookings(); }

    @GetMapping("/{id}")
    public Booking get(@PathVariable Long id) { return bookingService.getBookingById(id); }

    @PostMapping
    public Booking create(@RequestBody Booking booking) { return bookingService.saveBooking(booking); }

    @PutMapping("/{id}")
    public Booking update(@PathVariable Long id, @RequestBody Booking updated) {
        updated.setId(id);
        return bookingService.saveBooking(updated);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { bookingService.deleteBooking(id); }

    @GetMapping("/customer/{customerId}")
    public List<Booking> getBookingsByCustomer(@PathVariable Long customerId) {
        return bookingService.getBookingsByCustomer(customerId);
    }
}
