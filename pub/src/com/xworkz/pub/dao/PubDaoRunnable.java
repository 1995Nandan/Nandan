package com.xworkz.pub.dao;

import java.time.LocalDate;
import java.time.LocalTime;

import org.hibernate.internal.build.AllowSysOut;

import com.xworkz.pub.entity.PubEntity;

public class PubDaoRunnable {
	public static void main(String[] args) {
		PubEntity pubEntity = new PubEntity(1, "Resto", "Banglore", LocalTime.of(8, 0), LocalTime.of(12, 0), "Manoj",
				LocalDate.now(), "Nandan", LocalDate.now());

		PubEntity pubEntity1 = new PubEntity(2, "SilenceSource", "Mysore", LocalTime.of(8, 0), LocalTime.of(12, 0),
				"Manoj", LocalDate.now(), "Nandan", LocalDate.now());

		PubEntity pubEntity2 = new PubEntity(3, "Cafegarrage", "SriRangaPatna", LocalTime.of(8, 0), LocalTime.of(12, 0),
				"Manoj", LocalDate.now(), "Nandan", LocalDate.now());

		PubDao dao = new PubDaoImpl();
		// dao.save(pubEntity);
		// dao.save(pubEntity1);
		// dao.save(pubEntity2);

		// System.out.println("Data saved succesfully");

		// PubEntity entity=dao.findbyId(2);
		// System.out.println("Entity founded"+entity);

		// dao.updateNameAndLocationById("Lion", "Forest", 2);

		dao.deleteById(1);
	}
}
