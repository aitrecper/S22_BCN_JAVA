package com.dbmovies.dbmovies.repositories;

import com.dbmovies.dbmovies.entities.Genres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenresRepository extends JpaRepository<Genres, Long> {
}
