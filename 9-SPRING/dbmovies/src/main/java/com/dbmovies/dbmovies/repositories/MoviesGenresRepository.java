package com.dbmovies.dbmovies.repositories;

import com.dbmovies.dbmovies.entities.MoviesGenres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesGenresRepository extends JpaRepository<MoviesGenres, Long> {
}
