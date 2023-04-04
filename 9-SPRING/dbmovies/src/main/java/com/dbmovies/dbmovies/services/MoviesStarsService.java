package com.dbmovies.dbmovies.services;

import com.dbmovies.dbmovies.entities.MoviesStars;
import com.dbmovies.dbmovies.repositories.MoviesStarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesStarsService {

    @Autowired
    private MoviesStarsRepository moviesStarsRepository;

    public void save(MoviesStars moviesStars) {
        moviesStarsRepository.save(moviesStars);
    }

    public MoviesStars findById(Long id) {
        return moviesStarsRepository.findById(id).orElse(null);
    }

    public List<MoviesStars> findAll() {
        return moviesStarsRepository.findAll();
    }

    public void delete(MoviesStars moviesStars) {
        moviesStarsRepository.delete(moviesStars);
    }

    public MoviesStars update(MoviesStars moviesStars) {
        return moviesStarsRepository.save(moviesStars);
    }
}
