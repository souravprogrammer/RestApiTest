package com.movie.marval.controller;


import com.movie.marval.entity.MovieError;
import com.movie.marval.entity.Movies;
import com.movie.marval.services.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MoviesController {

    @Autowired
    private MoviesService moviesService;

    @GetMapping("/movies")
    public List<Movies> getAllMovies() {


        return moviesService.getMovies();
    }

    @GetMapping(path = "movies/{id}" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public Object getMovie(@PathVariable String id) {
        try {


            Long id_0 = Long.parseLong(id);
            return moviesService.getMovie(id_0).get();
        } catch (Exception e) {

            return new MovieError("error 401");
        }
    }

    @PostMapping( path = "/movies", produces = MediaType.APPLICATION_JSON_VALUE)
    public Object postMovie(@RequestBody Movies movies) {


        return moviesService.putMovies(movies);
    }

}
