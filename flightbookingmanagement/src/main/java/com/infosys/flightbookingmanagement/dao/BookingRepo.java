package com.infosys.flightbookingmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.flightbookingmanagement.models.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Integer>{

}
