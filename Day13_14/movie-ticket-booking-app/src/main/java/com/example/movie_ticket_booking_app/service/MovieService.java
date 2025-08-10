package com.example.movie_ticket_booking_app.service;

//package com.example.movieticketbookingapp.service;

import com.example.movie_ticket_booking_app.entity.Movie;
import com.example.movie_ticket_booking_app.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() { return movieRepository.findAll(); }
    public Movie getMovieById(Long id) { return movieRepository.findById(id).orElse(null); }
    public Movie saveMovie(Movie movie) { return movieRepository.save(movie); }
    public void deleteMovie(Long id) { movieRepository.deleteById(id); }
}
