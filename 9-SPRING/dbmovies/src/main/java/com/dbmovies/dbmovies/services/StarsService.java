package com.dbmovies.dbmovies.services;

import com.dbmovies.dbmovies.entities.Stars;
import com.dbmovies.dbmovies.repositories.StarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StarsService {

    @Autowired
    private StarsRepository starsRepository;

    public List<Stars> getAllStars() {
        return starsRepository.findAll();
    }

    public Stars getStarById(long id) {
        return starsRepository.findById(id).get();
    }

    public Stars save(Stars stars) {
        return starsRepository.save(stars);
    }

    public void delete(long id) {
        starsRepository.deleteById(id);
    }

    public Stars update(Stars stars) {
        return starsRepository.save(stars);
    }

}
