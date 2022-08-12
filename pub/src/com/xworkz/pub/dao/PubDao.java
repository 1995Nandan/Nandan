package com.xworkz.pub.dao;

import com.xworkz.pub.entity.PubEntity;

public interface PubDao {

	boolean save(PubEntity pubentity);

	PubEntity findbyId(int Id);

	void updateNameAndLocationById(String NewName, String NewLocation, int Id);

	void deleteById(int Id);
}
