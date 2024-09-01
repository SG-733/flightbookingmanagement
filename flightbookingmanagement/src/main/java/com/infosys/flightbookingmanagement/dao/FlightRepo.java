package com.infosys.flightbookingmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.flightbookingmanagement.models.Flight;

@Repository
public interface FlightRepo extends JpaRepository<Flight, Integer>{

}
