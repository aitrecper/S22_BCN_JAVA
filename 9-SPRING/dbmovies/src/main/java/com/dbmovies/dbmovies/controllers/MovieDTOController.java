package com.dbmovies.dbmovies.controllers;

import com.dbmovies.dbmovies.entities.MoviesDTO;
import com.dbmovies.dbmovies.services.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieDTOController {

    @Autowired
    private MoviesService moviesService;

    @GetMapping("/moviedto")
    public List<MoviesDTO> movieDTO() {
        return moviesService.getAllMoviesDTO();
    }

    @GetMapping("/moviedto/{id}")
    public MoviesDTO getMovieDTO(@PathVariable("id") Long id) {
        return moviesService.getMovieDTOById(id);
    }

}
