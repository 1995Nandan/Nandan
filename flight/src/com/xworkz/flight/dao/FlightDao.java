package com.xworkz.flight.dao;

import com.xworkz.flight.entity.FlightEntity;

public interface FlightDao {

	boolean save(FlightEntity flightentity);

	FlightEntity findbyId(int Id);

	void updateFlightNameAndDestinationById(String NewFlightName, String NewDestination, int Id);

	void deleteById(int Id);

}
