package com.dbmovies.dbmovies.repository;

import com.dbmovies.dbmovies.entities.Genres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenresRepository extends JpaRepository<Genres, Long> {
}
