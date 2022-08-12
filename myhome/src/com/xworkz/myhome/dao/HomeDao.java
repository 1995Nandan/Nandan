package com.xworkz.myhome.dao;

import com.xworkz.myhome.entity.HomeEntity;

public interface HomeDao {
	boolean save(HomeEntity medicalentity);

	HomeEntity findbyId(int Id);

	void updateHomeNameAndCreatedById(String NewHomeName, String NewCreatedBy, int Id);

	void deleteById(int Id);


}
