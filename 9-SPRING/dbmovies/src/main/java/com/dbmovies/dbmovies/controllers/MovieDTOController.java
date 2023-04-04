package com.dbmovies.dbmovies.controllers;

import com.dbmovies.dbmovies.entities.Movies;
import com.dbmovies.dbmovies.entities.MoviesDTO;
import com.dbmovies.dbmovies.services.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieDTOController {

    @Autowired
    private MoviesService moviesService;

    @GetMapping("/movieDTO")
    public List<MoviesDTO> movieDTO() {
        return moviesService.getAllMovies();
    }
}
