package com.dbmovies.dbmovies.repositories;

import com.dbmovies.dbmovies.entities.Stars;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StarsRepository extends JpaRepository<Stars, Long> {
}
