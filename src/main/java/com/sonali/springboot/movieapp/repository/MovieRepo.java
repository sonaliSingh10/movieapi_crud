package com.sonali.springboot.movieapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sonali.springboot.movieapp.models.Movie;

@Repository
public interface MovieRepo extends JpaRepository<Movie,Integer>{

}
