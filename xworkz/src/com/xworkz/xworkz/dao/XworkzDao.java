package com.xworkz.xworkz.dao;

import com.xworkz.xworkz.entity.XworkzEntity;

public interface XworkzDao {
	boolean save(XworkzEntity xworkzentity);

	XworkzEntity findbyId(int Id);

	void updateTraineeNameAndSubjectById(String NewTraineeName, String NewSubject, int Id);

	void deleteById(int Id);

}
