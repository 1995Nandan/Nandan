package com.xworkz.medical.dao;

import com.xworkz.medical.entity.MedicalEntity;

public interface MedicalDao {

	boolean save(MedicalEntity medicalentity);

	MedicalEntity findbyId(int Id);

	void updateFlightCreatedByAndUpdatedById(String NewCreatedBy, String NewUpdatedBy, int Id);

	void deleteById(int Id);

}
