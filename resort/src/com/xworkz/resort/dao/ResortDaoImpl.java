package com.xworkz.resort.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.resort.entity.ResortEntity;

public class ResortDaoImpl implements ResortDAO {

	@Override
	public boolean save(ResortEntity resort) {
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

			EntityManager manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(resort);
			tx.commit();
			manager.close();
			factory.close();
		} catch (PersistenceException e) {
			e.printStackTrace();

		}

		return true;
	}

}
