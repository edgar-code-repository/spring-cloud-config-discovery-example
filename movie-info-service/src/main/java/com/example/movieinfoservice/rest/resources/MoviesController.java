package com.example.movieinfoservice.rest.resources;

import com.example.movieinfoservice.model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MoviesController {

    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        List<Movie> movies = new ArrayList<Movie>();

        Movie movie1 = new Movie("aaa001", "Star Wars", 1977);
        Movie movie2 = new Movie("aaa002", "Alien", 1979);
        Movie movie3 = new Movie("aaa003", "Blade Runner", 1982);
        Movie movie4 = new Movie("aaa004", "The Terminator", 1984);
        Movie movie5 = new Movie("aaa005", "Predator", 1987);

        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);

        return movies;
    }

}
