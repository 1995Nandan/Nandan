package com.xworkz.medical.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.medical.entity.MedicalEntity;

public class MedicalDaoImpl implements MedicalDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public boolean save(MedicalEntity medicalentity) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			entityManager.persist(medicalentity);
			tx.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			entityManager.close();

		}
		return false;
	}

	@Override
	public MedicalEntity findbyId(int Id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			MedicalEntity entity = entityManager.find(MedicalEntity.class, Id);
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
	public void updateFlightCreatedByAndUpdatedById(String NewCreatedBy, String NewUpdatedBy, int Id) {
		EntityManager entityManager1 = entityManagerFactory.createEntityManager();
		EntityTransaction tx = entityManager1.getTransaction();
		tx.begin();
		try {
			MedicalEntity entity = entityManager1.find(MedicalEntity.class, Id);
			entity.setCreatedBy(NewCreatedBy);
			entity.setUpdatedBy(NewUpdatedBy);
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
			MedicalEntity entity = entityManager.find(MedicalEntity.class, Id);

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