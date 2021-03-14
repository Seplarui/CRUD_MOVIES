package com.init.movies.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.init.movies.entitys.Movie;

public interface MoviesDAO extends JpaRepository<Movie, Long> {

}
