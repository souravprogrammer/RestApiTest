package com.movie.marval.dao;


import com.movie.marval.entity.Movies;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesDao extends JpaRepository<Movies,Long> {
}
