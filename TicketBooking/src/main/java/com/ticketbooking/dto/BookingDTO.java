package com.ticketbooking.dto;

import com.mongo.springweb.dto.BookingDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookingDTO {
	int showId;
	String paymentMethod;
	int seatNo;

}
