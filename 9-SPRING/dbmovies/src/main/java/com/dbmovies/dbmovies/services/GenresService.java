package com.dbmovies.dbmovies.services;

import com.dbmovies.dbmovies.entities.Genres;
import com.dbmovies.dbmovies.repositories.GenresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenresService {

    @Autowired
    private GenresRepository genresRepository;

    public void save(Genres genre) {
        genresRepository.save(genre);
    }

    public Genres findById(Long id) {
        return genresRepository.findById(id).orElse(null);
    }

    public List<Genres> findAll() {
        return genresRepository.findAll();
    }

    public void deleteById(Long id) {
        genresRepository.deleteById(id);
    }

    public void update(Genres genre) {
        genresRepository.save(genre);
    }
}
