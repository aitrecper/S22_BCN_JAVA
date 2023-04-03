package com.dbmovies.dbmovies.repository;

import com.dbmovies.dbmovies.entities.Directors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectorsRepository extends JpaRepository<Directors, Long> {
}
