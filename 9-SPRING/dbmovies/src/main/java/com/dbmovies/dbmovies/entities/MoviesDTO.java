package com.dbmovies.dbmovies.entities;

import lombok.Data;

import java.util.Collection;
import java.util.List;

@Data
public class MoviesDTO {

    private int id;
    private String title;
    private String description;
    private List<String> directors;
    private List<String> genres;
    private List<String> stars;
}
