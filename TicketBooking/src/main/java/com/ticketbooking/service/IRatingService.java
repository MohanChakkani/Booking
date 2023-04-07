package com.ticketbooking.service;

import java.util.List;

import com.ticketbooking.entity.Rating;



public class IRatingService {
public Rating addReview(Rating ratingsDTO) throws MovieException;
	
	public List<Rating> getRatingsBymovieName(String moviename);


}
