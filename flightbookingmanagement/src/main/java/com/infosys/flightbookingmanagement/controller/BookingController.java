package com.infosys.flightbookingmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.infosys.flightbookingmanagement.models.Booking;
import com.infosys.flightbookingmanagement.service.BookingServiceImplementation;

@Controller
public class BookingController {

	@Autowired
	BookingServiceImplementation bookingServiceImplementation ;
	
	@GetMapping("/showbookingform")
	public String showBookingForm() {
		return "/bookingform";
	}
	
	@PostMapping("/handlebookingform")
	public ModelAndView addbooking(Booking b) {
		ModelAndView mv = new ModelAndView();
		bookingServiceImplementation.addBooking(b);
		mv.setViewName("redirect:/home");
		return mv;
	}
	
	@GetMapping("/bookingdetails")
	public String bookingbyIdform() {
		return "/bookingbyid";
	}
	
	@GetMapping("/findbookingbyid")
	public ModelAndView showBookingbyId(@RequestParam int bookingId) {
		ModelAndView mv = new ModelAndView();
		Booking b = bookingServiceImplementation.findBookingbyid(bookingId);
		
		if(b!=null) {
			mv.setViewName("/bookingdetails");
			mv.addObject("booking", b);
		}
		
		return mv;
	}
	
	@GetMapping("/cancelbooking")
	public String cancelbookingform() {
		return "/cancelbooking";
	}
	
	@GetMapping("cancelbookingbyid")
	public ModelAndView cancelBookingbyId(@RequestParam int bookingId) {
		ModelAndView mv = new ModelAndView();
		Booking b = bookingServiceImplementation.findBookingbyid(bookingId);
		
		if(b!=null) {
			bookingServiceImplementation.removeBooking(bookingId);
			mv.setViewName("redirect:/home");
		}
		
		return mv;
	}
}
