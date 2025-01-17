package com.infosys.flightbookingmanagement.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Flight {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String flightNumber;
    private String origin;
    private String destination;
}
