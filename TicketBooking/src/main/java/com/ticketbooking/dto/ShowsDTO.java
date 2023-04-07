package com.ticketbooking.dto;

import java.sql.Date;
import java.sql.Time;

import com.mongo.springweb.dto.BookingDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ShowsDTO {
	int showId;
	Date showDate;
	Time showTime;
	int availableSeats;


}
