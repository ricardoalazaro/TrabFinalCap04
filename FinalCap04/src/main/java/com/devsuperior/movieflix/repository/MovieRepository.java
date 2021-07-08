package com.devsuperior.movieflix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.movieflix.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
