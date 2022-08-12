package com.xworkz.xworkz.dao;

import java.time.LocalDate;

import com.xworkz.xworkz.entity.XworkzEntity;

public class XworkzDaoRunnable {
	public static void main(String[] args) {

		XworkzEntity xworkzEntity = new XworkzEntity(1, "Omkar", "JPA", "15Days", 24000.00, "Omkar", LocalDate.now(),
				"Nandan", LocalDate.now());

		XworkzEntity xworkzEntity1 = new XworkzEntity(2, "Asha", "JAVA", "3Months", 24000.00, "Omkar", LocalDate.now(),
				"Nandan", LocalDate.now());

		XworkzEntity xworkzEntity2 = new XworkzEntity(3, "Sunil", "SQL", "20Days", 24000.00, "Omkar", LocalDate.now(),
				"Nandan", LocalDate.now());

		XworkzDao dao = new XworkzDaoImpl();

		/*
		 * dao.save(xworkzEntity);
		 * 
		 * dao.save(xworkzEntity1);
		 * 
		 * dao.save(xworkzEntity2);
		 */

		XworkzEntity entity = dao.findbyId(2);
		System.out.println(entity);

		dao.updateTraineeNameAndSubjectById("Sancho", "SQL", 3);

		dao.deleteById(3);

	}

}
