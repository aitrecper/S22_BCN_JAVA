package com.dbmovies.dbmovies.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;

@Data
@Entity
@Table(name = "stars")
public class Stars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "name")
    private String name;

    @Column (name = "about")
    private String about;

    @ManyToMany(mappedBy = "stars")
    private Collection<Movies> movies;
}
