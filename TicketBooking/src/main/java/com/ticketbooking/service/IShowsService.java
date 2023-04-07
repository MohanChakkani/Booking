package com.ticketbooking.service;

import java.util.List;

import com.ticketbooking.entity.Shows;



public interface IShowsService {
public List<Shows> getShows();
	
	public List<Shows> searchShowsByTitle(String movieTitle);

}
