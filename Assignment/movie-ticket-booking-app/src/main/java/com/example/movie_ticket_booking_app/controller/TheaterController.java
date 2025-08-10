package com.example.movie_ticket_booking_app.controller;

//package com.example.movieticketbookingapp.controller;

import com.example.movie_ticket_booking_app.entity.Theater;
import com.example.movie_ticket_booking_app.service.TheaterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/theaters")
public class TheaterController {
    private final TheaterService theaterService;

    public TheaterController(TheaterService theaterService) {
        this.theaterService = theaterService;
    }

    @GetMapping
    public List<Theater> getTheaters() { return theaterService.getAllTheaters(); }

    @GetMapping("/{id}")
    public Theater getTheater(@PathVariable Long id) { return theaterService.getTheaterById(id); }

    @PostMapping
    public Theater createTheater(@RequestBody Theater theater) { return theaterService.saveTheater(theater); }

    @PutMapping("/{id}")
    public Theater updateTheater(@PathVariable Long id, @RequestBody Theater updated) {
        updated.setId(id);
        return theaterService.saveTheater(updated);
    }

    @DeleteMapping("/{id}")
    public void deleteTheater(@PathVariable Long id) { theaterService.deleteTheater(id); }
}
