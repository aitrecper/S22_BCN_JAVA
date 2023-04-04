//package com.dbmovies.dbmovies.services;
//
//import com.dbmovies.dbmovies.entities.MoviesDirectors;
//import com.dbmovies.dbmovies.repositories.MoviesDirectorsRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class MoviesDirectorsService {
//
//    @Autowired
//    private MoviesDirectorsRepository moviesDirectorsRepository;
//
//    public List<MoviesDirectors> findAll() {
//        return moviesDirectorsRepository.findAll();
//    }
//
//    public MoviesDirectors findById(Long id) {
//        return moviesDirectorsRepository.findById(id).get();
//    }
//
//    public List<MoviesDirectors> findByMoviesId(Long moviesId) {
//        return moviesDirectorsRepository.findByMoviesId(moviesId);
//    }
//
//    public MoviesDirectors save(MoviesDirectors moviesDirectors) {
//        return moviesDirectorsRepository.save(moviesDirectors);
//    }
//
//    public void delete(Long id) {
//        moviesDirectorsRepository.deleteById(id);
//    }
//
//    public MoviesDirectors update(MoviesDirectors moviesDirectors) {
//        return moviesDirectorsRepository.save(moviesDirectors);
//    }
//}
