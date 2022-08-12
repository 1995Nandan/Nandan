package com.xworkz.oyo.dao;

import com.xworkz.oyo.entity.OyoEntity;

public interface OyoDao {
	boolean save(OyoEntity medicalentity);

	OyoEntity findbyId(int Id);

	void updateHotelNameAndLocationById(String NewHotelName, String NewLocation, int Id);

	void deleteById(int Id);


}
