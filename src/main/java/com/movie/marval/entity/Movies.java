package com.movie.marval.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movies{

    @Id
    private Long id;

    private String movieName;


    public Movies() {
    }

    public Movies(Long id, String movieName) {
        this.id = id;
        this.movieName = movieName;
    }

    public Long getId() {
        return id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                '}';
    }
}
