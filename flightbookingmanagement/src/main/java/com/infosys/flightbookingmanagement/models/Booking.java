package com.infosys.flightbookingmanagement.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Booking {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;

    @NotEmpty(message = "Passenger name is required")
    private String passengerName;

    @Pattern(regexp = "[A-Z][0-9]{1,2}", message = "Seat number must be in the format 'A1', 'B2', etc.")
    private String seatNumber;
    
    @NotEmpty(message = "Flight number is required")
    private String flightNumber;
}
