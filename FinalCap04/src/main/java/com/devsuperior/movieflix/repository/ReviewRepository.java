package com.devsuperior.movieflix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.movieflix.entities.Review;

public interface ReviewRepository extends JpaRepository<Review, Long>{

}
