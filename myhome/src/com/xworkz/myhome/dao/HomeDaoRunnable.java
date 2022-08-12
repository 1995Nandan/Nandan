package com.xworkz.myhome.dao;

import java.time.LocalDate;

import com.xworkz.myhome.entity.HomeEntity;

public class HomeDaoRunnable {

	public static void main(String[] args) {
		HomeEntity entity = new HomeEntity(1, "Brindavana", 5, 2.00, 3.00, "Bramha", LocalDate.now(), "Nandan",
				LocalDate.now());

		HomeEntity entity1 = new HomeEntity(2, "NammaKutira", 7, 4.00, 3.00, "Bramha", LocalDate.now(), "Nandan",
				LocalDate.now());

		HomeEntity entity2 = new HomeEntity(3, "RanjaniNilaya", 5, 2.00, 3.00, "Bramha", LocalDate.now(), "Nandan",
				LocalDate.now());

		HomeDao dao = new HomeDaoImpl();
		dao.save(entity);
		dao.save(entity1);
		dao.save(entity2);

		HomeEntity entity3 = dao.findbyId(2);
		System.out.println(entity3);

		dao.updateHomeNameAndCreatedById("NandanNilaya", "Shivanna", 2);

		dao.deleteById(2);

	}

}
