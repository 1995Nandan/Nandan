package com.xworkz.oyo.dao;
import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.oyo.entity.OyoEntity;

public class OyoDaoRunnable {
	public static void main(String[] args) {
		
		OyoEntity oyoEntity = new OyoEntity(1,"LavanyaResidency", "Mandya", LocalTime.of(11, 00),
				LocalTime.of(12, 00), 800.00, "CivilEnginers", LocalDate.now(), "Nandan", LocalDate.now());
		
		OyoEntity oyoEntity1 = new OyoEntity(2, "HotelHaripriya", "Mandya", LocalTime.of(11, 00),
				LocalTime.of(12, 00), 800.00, "CivilEnginers", LocalDate.now(), "Nandan", LocalDate.now());
		
		OyoEntity oyoEntity2 = new OyoEntity(3, "Amaravathi", "Mandya", LocalTime.of(11, 00),
				LocalTime.of(12, 00), 800.00, "CivilEnginers", LocalDate.now(), "Nandan", LocalDate.now());
		
		
		OyoDao dao = new OyoDaoImpl();
		/*dao.save(oyoEntity);
		
		dao.save(oyoEntity1);
		dao.save(oyoEntity2);*/
		
	OyoEntity  entity	=dao.findbyId(1);
	System.out.println(entity);
	
	dao.updateHotelNameAndLocationById("RadisionBlue","Mysore", 2);
	
	dao.deleteById(1);
		
	}
	
	}

