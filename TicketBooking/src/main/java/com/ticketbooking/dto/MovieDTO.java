package com.ticketbooking.dto;

import com.mongo.springweb.dto.BookingDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MovieDTO {
	int movieId;
	String movieTitle;
	String genre;
	String director;
	int duration;
	double rating;


}
