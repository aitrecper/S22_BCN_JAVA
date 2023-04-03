package com.dbmovies.dbmovies.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "movies_stars")
public class MoviesStars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "movies_id")
    private int movieId;

    @Column(name = "stars_id")
    private int starId;
}
