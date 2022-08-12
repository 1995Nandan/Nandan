package com.xworkz.manoj.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.manoj.entity.ManojEntity;

public class ManojDaoImpl implements ManojDao {

	@Override
	public boolean save(ManojEntity manojentity) {
	EntityManagerFactory factory	= Persistence.createEntityManagerFactory("com.xworkz");
	
	EntityManager manager=factory.createEntityManager();
	EntityTransaction ex = manager.getTransaction();
	ex.begin();
	manager.persist(manojentity);
	ex.commit();
	manager.close();
	factory.close();
	
	
		return true;
	}
;
}
