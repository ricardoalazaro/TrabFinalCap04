package com.devsuperior.movieflix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.movieflix.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
	
}
