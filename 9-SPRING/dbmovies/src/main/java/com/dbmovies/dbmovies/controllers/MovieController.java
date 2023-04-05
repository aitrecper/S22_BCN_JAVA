package com.dbmovies.dbmovies.controllers;

import com.dbmovies.dbmovies.entities.Movies;
import com.dbmovies.dbmovies.services.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MoviesService moviesService;

    @GetMapping("/movies")
    public List<Movies> getAllMovies() {
        return moviesService.getAllMovies();
    }

    @GetMapping("/movies/{id}")
    public Movies getMovieById(@PathVariable Long id) {
        return moviesService.getMovieById(id);
    }

    @PostMapping("/movies")
    public Movies addMovie(@RequestBody Movies movie) {
        return moviesService.saveMovie(movie);
    }

    @PutMapping ("/movies/{id}")
    public Movies updateMovie(@PathVariable Long id, Movies movie) {
        return moviesService.updateMovie(id, movie);
    }

    @DeleteMapping("/movies/{id}")
    public void deleteMovie(@PathVariable Long id) {
        moviesService.deleteMovie(id);
    }
}
