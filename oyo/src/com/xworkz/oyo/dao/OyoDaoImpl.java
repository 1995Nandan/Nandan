package com.xworkz.oyo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.oyo.entity.OyoEntity;

public class OyoDaoImpl implements OyoDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public boolean save(OyoEntity oyoentity) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(oyoentity);
		tx.commit();
		entityManager.close();
	
		return false;
	}

	@Override
	public OyoEntity findbyId(int Id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			OyoEntity entity = entityManager.find(OyoEntity.class, Id);
			if (entity != null) {
				return entity;

			}

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}

		return null;
	}

	@Override
	public void updateHotelNameAndLocationById(String NewHotelName, String NewLocation, int Id) {
		EntityManager entityManager1 = entityManagerFactory.createEntityManager();
		EntityTransaction tx = entityManager1.getTransaction();
		tx.begin();
		try {
			OyoEntity entity = entityManager1.find(OyoEntity.class, Id);
			entity.setHotelName(NewHotelName);
			entity.setLocation(NewLocation);

			tx.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			entityManager1.close();
		}
	}

	@Override
	public void deleteById(int Id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		try {
			OyoEntity entity = entityManager.find(OyoEntity.class, Id);

			entityManager.remove(entity);
			tx.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}

		finally {
			entityManager.close();

		}

	}

}
