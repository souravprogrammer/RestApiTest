package com.movie.marval.services;


import com.movie.marval.dao.MoviesDao;
import com.movie.marval.entity.MovieError;
import com.movie.marval.entity.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MoviesServiceImpl implements MoviesService {


    @Autowired
    MoviesDao moviesDao;

    public MoviesServiceImpl() {


    }

    @Override
    public List<Movies> getMovies() {
        return moviesDao.findAll();

    }

    @Override
    public Optional<Movies> getMovie(Long id) {

        return moviesDao.findById(id);
    }

    @Override
    public Object putMovies(Movies movies) {
        if (moviesDao.existsById(movies.getId())) {

            return new MovieError("error 401");

        }
        return moviesDao.save(movies);
    }


}
