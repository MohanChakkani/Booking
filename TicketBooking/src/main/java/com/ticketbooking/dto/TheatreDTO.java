package com.ticketbooking.dto;

import com.mongo.springweb.dto.BookingDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TheatreDTO {
	int theatreId;
	String theatreName;
	String location;
	int seatingCapacity;

}
