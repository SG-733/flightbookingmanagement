package com.infosys.flightbookingmanagement.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.infosys.flightbookingmanagement.models.Flight;
import com.infosys.flightbookingmanagement.service.FlightServiceImplementation;

@Controller
public class FlightController {

	@Autowired
	FlightServiceImplementation flightServiceImplementation;
	
	@GetMapping("/home")
	public String showHomePage() {
		return "/home";
	}
	
	@GetMapping("/showflightform")
	public String showFlightForm() {
		return "/flightform";
	}
	
	@PostMapping("/addflight")
	public ModelAndView addFlight(Flight f) {
		//System.out.println(f.getFlightNumber());
		//System.out.println(f.getId());
		flightServiceImplementation.addFlight(f);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/home");
		//mv.addObject("msg", "flight added");
		
		return mv;
	}
	
	@GetMapping("/flightlist")
	public ModelAndView showAllFlights() {
		
		List<Flight> flights = flightServiceImplementation.allFlights();
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/flightlist");
		mv.addObject("flights", flights);
		
		return mv;
	}
	
	@GetMapping("/deleteFlight")
	public ModelAndView removeFlight(@RequestParam int id) {
		
		String msg = flightServiceImplementation.removeFlight(id);
		
		ModelAndView mv = new ModelAndView();
		
		if(msg!=null) {
			List<Flight> flights = flightServiceImplementation.allFlights();
			mv.setViewName("/flightlist");
			mv.addObject("flights", flights);
		}
		else {
			mv.setViewName("/delete");
		}
		
		return mv;
	}
	
	@GetMapping("/flightbyid")
	public String showFindbyId() {
		return "/flightbyid";
	}
	
	@GetMapping("/findflightbyid")
	public ModelAndView flightbyId(@RequestParam int id) {
		ModelAndView mv = new ModelAndView();
		
		Flight f = flightServiceImplementation.flightById(id);
		
		if(f!=null) {
			mv.setViewName("/flightdetails");
			mv.addObject("flight", f);
		}
		
		return mv;
	}
	
	@GetMapping("/editFlight")
	public ModelAndView updateFlight(@RequestParam int id) {
		ModelAndView mv = new ModelAndView("/flightupdateform");
		mv.addObject("id", id);
		
		return mv;
	}
	
	@PostMapping("/updateinfo")
	public ModelAndView updateFlightinfo(Flight flight) {
		ModelAndView mv = new ModelAndView();
		flightServiceImplementation.updateFlight(flight);
		mv.setViewName("redirect:/home");
		
		return mv;
	}
	
}
