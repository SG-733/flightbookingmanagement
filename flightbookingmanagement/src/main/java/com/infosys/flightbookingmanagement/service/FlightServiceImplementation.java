package com.infosys.flightbookingmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.flightbookingmanagement.dao.FlightRepo;
import com.infosys.flightbookingmanagement.models.Flight;

@Service
public class FlightServiceImplementation implements FlightService{

	@Autowired
	FlightRepo flightRepo;
	
	@Override
	public void addFlight(Flight f) {
		// TODO Auto-generated method stub
		try {
			Flight flight = flightRepo.save(f);
			if(flight!=null) {
				System.out.println("Flight Added Successfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Failed to add Flight");
		}
	}

	@Override
	public List<Flight> allFlights() {
		// TODO Auto-generated method stub
		List<Flight> flist = flightRepo.findAll();
		return flist;
	}

	@Override
	public String removeFlight(int id) {
		// TODO Auto-generated method stub
		String msg=null;
		Flight f = flightRepo.findById(id).get();
		if(f!=null) {
			flightRepo.delete(f);
			msg="Flight Removed";
		}
		return msg;
	}

	@Override
	public Flight flightById(int id) {
		// TODO Auto-generated method stub
		Flight f = flightRepo.findById(id).get();
		return f;
	}

	@Override
	public void updateFlight(Flight updatedFlight) {
		// TODO Auto-generated method stub
		
		Flight oldFlight = flightRepo.findById(updatedFlight.getId()).get();
		
		if(oldFlight!=null) {
			oldFlight.setOrigin(updatedFlight.getOrigin());
			oldFlight.setDestination(updatedFlight.getDestination());
		}
		
		flightRepo.save(oldFlight);
		
	}
}
