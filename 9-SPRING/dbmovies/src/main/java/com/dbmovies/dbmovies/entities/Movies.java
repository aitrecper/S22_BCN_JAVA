package com.dbmovies.dbmovies.entities;

import jakarta.persistence.*;
import lombok.Data;


import java.util.Collection;

@Data
@Entity
@Table(name = "movies")
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "year")
    private int year;

    @Column(name = "image_url")
    private String image_url;

    @Column(name = "description")
    private String description;

    @Column(name = "imdb_rating")
    private double imdb_rating;

    @Column(name = "certificate")
    private String certificate;

    @Column(name = "runtime")
    private int runtime;

    @Column(name = "metascore")
    private int metascore;

    @Column(name = "votes")
    private int votes;

    @Column(name = "gross")
    private int gross;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "movies_directors",
    joinColumns = @JoinColumn(name = "movies_id"),
    inverseJoinColumns = @JoinColumn(name = "directors_id"))
    private Collection<Directors> directors;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "movies_genres",
            joinColumns = @JoinColumn(name = "movies_id"),
            inverseJoinColumns = @JoinColumn(name = "genres_id"))
    private Collection<Genres> genres;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "movies_stars",
            joinColumns = @JoinColumn(name = "movies_id"),
            inverseJoinColumns = @JoinColumn(name = "stars_id"))
    private Collection<Stars> stars;
}
