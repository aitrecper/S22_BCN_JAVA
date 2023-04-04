package com.dbmovies.dbmovies.services;

import com.dbmovies.dbmovies.entities.MoviesGenres;
import com.dbmovies.dbmovies.repositories.MoviesGenresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MoviesGenresService {

    @Autowired
    private MoviesGenresRepository moviesGenresRepository;

    public List<MoviesGenres> findAll() {
        return moviesGenresRepository.findAll();
    }

    public Optional<MoviesGenres> findById(Long id) {

        return moviesGenresRepository.findById(id);
    }

    public MoviesGenres save(MoviesGenres moviesGenres) {
        return moviesGenresRepository.save(moviesGenres);
    }

    public void delete(MoviesGenres moviesGenres) {
        moviesGenresRepository.delete(moviesGenres);
    }

    public MoviesGenres update(MoviesGenres moviesGenres) {
        return moviesGenresRepository.save(moviesGenres);
    }
}
