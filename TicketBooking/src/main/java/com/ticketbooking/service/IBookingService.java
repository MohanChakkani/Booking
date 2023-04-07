package com.ticketbooking.service;

import java.util.List;

import com.ticketbooking.dto.BookingDTO;
import com.ticketbooking.entity.Booking;



public interface IBookingService {
public Booking bookTicket(BookingDTO bookings) throws MovieException;
	
	
	public List<Booking> getAllMyBookings();
	
	public String cancelMyBooking(int bookingId) throws MovieException;

}
