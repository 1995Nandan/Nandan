package com.xworkz.flight.dao;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.flight.entity.FlightEntity;

public class FlightDaoRunnable {
	public static void main(String[] args) {

		FlightEntity entity = new FlightEntity(1, "Kingfisher", "Banglore", "NewDehli", LocalTime.of(11, 00),
				LocalTime.of(2, 00), "Vijayamalya", LocalDate.now(), "Nandan", LocalDate.now());

		FlightEntity entity1 = new FlightEntity(2, "Airasia", "Chennai", "NewDehli", LocalTime.of(11, 00),
				LocalTime.of(2, 00), "Tata", LocalDate.now(), "Nandan", LocalDate.now());

		FlightEntity entity2 = new FlightEntity(3, "Indigo", "Banglore", "NewDehli", LocalTime.of(11, 00),
				LocalTime.of(2, 00), "Indigo", LocalDate.now(), "Nandan", LocalDate.now());

		FlightDao dao = new FlightDaoImpl();
		/*
		 * dao.save(entity); dao.save(entity1); dao.save(entity2);
		 * System.out.println("Flight details added successfully");
		 */

		// FlightEntity entity3 = dao.findbyId(2);

		// System.out.println(entity3);
		// dao.updateFlightNameAndDestinationById("Airlines", "Manglore", 2);
		dao.deleteById(2);

	}

}
