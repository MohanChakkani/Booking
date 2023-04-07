package com.ticketbooking.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RatingDTO {
	int  movieId;

	Double rating;

	String review;


}
