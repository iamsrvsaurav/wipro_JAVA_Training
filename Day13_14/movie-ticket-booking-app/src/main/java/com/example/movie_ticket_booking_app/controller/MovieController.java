package com.example.movie_ticket_booking_app.controller;
//package com.example.movieticketbookingapp.controller;

import com.example.movie_ticket_booking_app.entity.Movie;
import com.example.movie_ticket_booking_app.service.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<Movie> getMovies() { return movieService.getAllMovies(); }

    @GetMapping("/{id}")
    public Movie getMovie(@PathVariable Long id) { return movieService.getMovieById(id); }

    @PostMapping
    public Movie createMovie(@RequestBody Movie movie) { return movieService.saveMovie(movie); }

    @PutMapping("/{id}")
    public Movie updateMovie(@PathVariable Long id, @RequestBody Movie updated) {
        updated.setId(id);
        return movieService.saveMovie(updated);
    }

    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable Long id) { movieService.deleteMovie(id); }
}
