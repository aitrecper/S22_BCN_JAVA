package com.dbmovies.dbmovies.repositories;

import com.dbmovies.dbmovies.entities.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepository extends JpaRepository<Movies, Long> {}
