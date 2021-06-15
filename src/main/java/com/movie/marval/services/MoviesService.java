package com.movie.marval.services;

import com.movie.marval.entity.Movies;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MoviesService {

     List<Movies> getMovies();
     Optional<Movies> getMovie(Long id);
     Object putMovies(Movies movies) ;


}
