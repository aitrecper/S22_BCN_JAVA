package com.dbmovies.dbmovies.repository;

import com.dbmovies.dbmovies.entities.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepository extends JpaRepository<Movies, Long> {
}
