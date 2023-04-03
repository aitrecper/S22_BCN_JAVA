package com.dbmovies.dbmovies.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "movies_directors")
public class MoviesDirectors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "movies_id")
    private int moviesId;

    @Column(name = "directors_id")
    private int directorsId;
}
