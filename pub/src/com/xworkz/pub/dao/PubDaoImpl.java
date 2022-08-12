package com.xworkz.pub.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.pub.entity.PubEntity;

public class PubDaoImpl implements PubDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public boolean save(PubEntity pubentity) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		try {
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			entityManager.persist(pubentity);
			tx.commit();


		} catch (PersistenceException e) {
			e.printStackTrace();
		}

		finally {
			entityManager.close();

		}

		return false;
	}

	@Override
	public PubEntity findbyId(int Id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		try {

			PubEntity entity = entityManager.find(PubEntity.class, Id);
			if (entity != null) {
				System.out.println("Entity found " + Id);
				return entity;
			} else {
				System.out.println("Entity not found" + Id);

			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}

		return null;
	}

	@Override
	public void updateNameAndLocationById(String Newname, String NewLocation, int Id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		try {
			PubEntity entity = entityManager.find(PubEntity.class, Id);

			entity.setName(Newname);
			entity.setLocation(NewLocation);
			tx.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
	}

	@Override
	public void deleteById(int Id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		try {
			PubEntity entity = entityManager.find(PubEntity.class, Id);

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
