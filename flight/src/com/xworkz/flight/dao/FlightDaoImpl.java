package com.xworkz.flight.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.flight.entity.FlightEntity;

public class FlightDaoImpl implements FlightDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public boolean save(FlightEntity flightentity) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			entityManager.persist(flightentity);
			tx.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			entityManager.close();

		}
		return false;
	}

	@Override
	public FlightEntity findbyId(int Id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			FlightEntity entity = entityManager.find(FlightEntity.class, Id);
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
	public void updateFlightNameAndDestinationById(String NewFlightName, String NewDestination, int Id) {
		EntityManager entityManager1 = entityManagerFactory.createEntityManager();
		EntityTransaction tx = entityManager1.getTransaction();
		tx.begin();
		try {
			FlightEntity entity = entityManager1.find(FlightEntity.class, Id);
			entity.setFlightName(NewFlightName);
			entity.setDestination(NewDestination);
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
			FlightEntity entity = entityManager.find(FlightEntity.class, Id);

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
