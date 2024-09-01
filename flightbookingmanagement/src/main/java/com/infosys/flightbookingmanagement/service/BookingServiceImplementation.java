package com.infosys.flightbookingmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.flightbookingmanagement.dao.BookingRepo;
import com.infosys.flightbookingmanagement.models.Booking;

@Service
public class BookingServiceImplementation implements BookingService{

	@Autowired
	BookingRepo bookingRepo;
	
	@Override
	public void addBooking(Booking b) {
		// TODO Auto-generated method stub
		try {
			bookingRepo.save(b);
			System.out.println("Booking Added Successfully");
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Failed to add booking"+e);
		}
	}

	@Override
	public Booking findBookingbyid(int id) {
		// TODO Auto-generated method stub
		Booking b = null;
		try {
			 b = bookingRepo.findById(id).get();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Failed to find booking"+e);
		}
		return b;
	}

	@Override
	public void removeBooking(int id) {
		// TODO Auto-generated method stub
		Booking b = bookingRepo.findById(id).get();
		try {
			bookingRepo.delete(b);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Failed to cancel booking");
		}
		
	}

}
