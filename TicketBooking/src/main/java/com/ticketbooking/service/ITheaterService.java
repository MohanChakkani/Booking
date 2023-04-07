package com.ticketbooking.service;

import java.util.List;


import com.ticketbooking.entity.Theater;

public interface ITheaterService {
public List<Theater> getTheatres();
	
	public List<Theater>searchTheatresByKeyword(String keyword);

}
