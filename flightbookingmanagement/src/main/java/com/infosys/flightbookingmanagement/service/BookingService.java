package com.infosys.flightbookingmanagement.service;

import org.springframework.stereotype.Repository;

import com.infosys.flightbookingmanagement.models.Booking;

@Repository
public interface BookingService {

	public void addBooking(Booking b);
	public Booking findBookingbyid(int id);
	public void removeBooking(int id);
}
