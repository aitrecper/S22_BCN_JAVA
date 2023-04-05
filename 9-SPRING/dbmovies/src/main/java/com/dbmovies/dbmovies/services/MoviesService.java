package com.dbmovies.dbmovies.services;

import com.dbmovies.dbmovies.entities.*;
import com.dbmovies.dbmovies.repositories.MoviesRepository;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MoviesService {

    private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(MoviesService.class);

    @Autowired
    private MoviesRepository moviesRepository;


    public Movies saveMovie(Movies movie) {
       return moviesRepository.save(movie);
    }

    public List<Movies> getAllMovies() {
        return moviesRepository.findAll();
    }

    public List<MoviesDTO> getAllMoviesDTO() {
        List<Movies> moviesList =  moviesRepository.findAll();
        LOGGER.info("List of movies: {}", moviesList);

        List<MoviesDTO> moviesDtoList = new ArrayList<>();

        for (Movies movies : moviesList) {
            MoviesDTO moviesDto = new MoviesDTO();

            moviesDto.setId(movies.getId());
            moviesDto.setTitle(movies.getTitle());
            List<String> directorsList = new ArrayList<>();
            for (Directors director : movies.getDirectors()) {
                directorsList.add(director.getName());
            }
            List<String> genresList = new ArrayList<>();
            for (Genres genre : movies.getGenres()) {
                genresList.add(genre.getName());
            }
            List<String> castList = new ArrayList<>();
            for (Stars star : movies.getStars()) {
                castList.add(star.getName());
            }
            moviesDto.setDirectors(directorsList);
            moviesDto.setGenres(genresList);
            moviesDto.setStars(castList);
            moviesDtoList.add(moviesDto);
        }
        return moviesDtoList;
    }

    public Movies getMovieById(Long id) {
        return moviesRepository.findById(id).get();
    }

    public MoviesDTO getMovieDTOById(Long id) {
        MoviesDTO moviesDto = new MoviesDTO();
        Movies movie = moviesRepository.findById(id).get();

        moviesDto.setId(movie.getId());
        moviesDto.setTitle(movie.getTitle());
        List<String> directorsList = new ArrayList<>();
        for (Directors director : movie.getDirectors()) {
            directorsList.add(director.getName());
        }
        List<String> genresList = new ArrayList<>();
        for (Genres genre : movie.getGenres()) {
            genresList.add(genre.getName());
        }
        List<String> castList = new ArrayList<>();
        for (Stars star : movie.getStars()) {
            castList.add(star.getName());
        }
        moviesDto.setDirectors(directorsList);
        moviesDto.setGenres(genresList);
        moviesDto.setStars(castList);

        return moviesDto;
    }

    public String deleteMovie(Long id) {
        moviesRepository.deleteById(id);
        return "Movie deleted";
    }

    public Movies updateMovie(Long id, Movies movie) {
        movie.setId(Math.toIntExact(id));
        return moviesRepository.save(movie);
    }
}
