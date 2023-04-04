package com.dbmovies.dbmovies.services;

import com.dbmovies.dbmovies.entities.Directors;
import com.dbmovies.dbmovies.repositories.DirectorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorsService {

    @Autowired
    private DirectorsRepository directorsRepository;

    public List<Directors> findAll() {
        return directorsRepository.findAll();
    }

    public Directors findById(Long id) {
        return directorsRepository.findById(id).orElse(null);
    }

    public Directors save(Directors director) {
        return directorsRepository.save(director);
    }

    public void delete(Long id) {
        directorsRepository.deleteById(id);
    }

    public void update(Directors director) {
        directorsRepository.save(director);
    }
}
