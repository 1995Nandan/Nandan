package com.xworkz.xworkz.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.xworkz.entity.XworkzEntity;

public class XworkzDaoImpl implements XworkzDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public boolean save(XworkzEntity xworkzentity) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(xworkzentity);
		tx.commit();
		entityManager.close();

		return false;
	}

	@Override
	public XworkzEntity findbyId(int Id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			XworkzEntity entity = entityManager.find(XworkzEntity.class, Id);
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
	public void updateTraineeNameAndSubjectById(String NewTraineeName, String NewSubject, int Id) {
		EntityManager entityManager1 = entityManagerFactory.createEntityManager();
		EntityTransaction tx = entityManager1.getTransaction();
		tx.begin();
		try {
			XworkzEntity entity = entityManager1.find(XworkzEntity.class, Id);
			entity.setTraineeName(NewTraineeName);
			entity.setSubject(NewSubject);

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
			XworkzEntity entity = entityManager.find(XworkzEntity.class, Id);

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
