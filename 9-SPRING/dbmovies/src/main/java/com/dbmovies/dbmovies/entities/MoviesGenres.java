package com.dbmovies.dbmovies.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "movies_genres")
public class MoviesGenres {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "movies_id")
    private int moviesId;

    @Column(name = "genres_id")
    private int genresId;
}
