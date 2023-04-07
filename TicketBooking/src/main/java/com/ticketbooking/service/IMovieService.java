package com.ticketbooking.service;

import java.util.List;

import com.ticketbooking.entity.Movie;



public interface IMovieService {
public List<Movie> getMovies();
	
	public List<Movie>searchMoviesByKeyword(String keyword);
	

}
