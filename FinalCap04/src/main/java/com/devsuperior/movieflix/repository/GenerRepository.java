package com.devsuperior.movieflix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.movieflix.entities.Genre;

public interface GenerRepository extends JpaRepository<Genre, Long>{

}
