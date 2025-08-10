package com.example.movie_ticket_booking_app.service;

//package com.example.movieticketbookingapp.service;

import com.example.movie_ticket_booking_app.entity.Theater;
import com.example.movie_ticket_booking_app.repository.TheaterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheaterService {
    private final TheaterRepository theaterRepository;

    public TheaterService(TheaterRepository theaterRepository) {
        this.theaterRepository = theaterRepository;
    }

    public List<Theater> getAllTheaters() { return theaterRepository.findAll(); }
    public Theater getTheaterById(Long id) { return theaterRepository.findById(id).orElse(null); }
    public Theater saveTheater(Theater theater) { return theaterRepository.save(theater); }
    public void deleteTheater(Long id) { theaterRepository.deleteById(id); }
}
