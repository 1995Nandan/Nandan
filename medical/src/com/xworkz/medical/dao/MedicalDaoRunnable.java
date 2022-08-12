package com.xworkz.medical.dao;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.medical.entity.MedicalEntity;

public class MedicalDaoRunnable {

	public static void main(String[] args) {
		MedicalEntity entity = new MedicalEntity(1, "Maruthi", "Mandya", LocalTime.of(11, 00), LocalTime.of(11, 00),
				"Darshan", LocalDate.now(), "Nandan", LocalDate.now());

		MedicalEntity entity1 = new MedicalEntity(2, "Krupa", "Mandya", LocalTime.of(11, 00), LocalTime.of(11, 00),
				"Darshan", LocalDate.now(), "Nandan", LocalDate.now());

		MedicalEntity entity2 = new MedicalEntity(3, "SriNidhi", "Mandya", LocalTime.of(11, 00), LocalTime.of(11, 00),
				"Darshan", LocalDate.now(), "Nandan", LocalDate.now());

		MedicalDao dao = new MedicalDaoImpl();
		/*
		 * dao.save(entity); dao.save(entity1); dao.save(entity2);
		 */

		// MedicalEntity entity3 = dao.findbyId(1);
		// System.out.println(entity3);

		// dao.updateFlightCreatedByAndUpdatedById("Hanumanth", "Arjun", 3);
		dao.deleteById(2);
	}
}
