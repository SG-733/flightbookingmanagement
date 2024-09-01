package com.infosys.flightbookingmanagement.service;

import java.util.List;

import com.infosys.flightbookingmanagement.models.Flight;

public interface FlightService {

	public void addFlight(Flight f);
	public List<Flight> allFlights();
	public String removeFlight(int id);
	public Flight flightById(int id);
	public void updateFlight(Flight updatedFlight);
}
