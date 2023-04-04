package com.dbmovies.dbmovies.repositories;

import com.dbmovies.dbmovies.entities.MoviesStars;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesStarsRepository extends JpaRepository<MoviesStars, Long> {
}
