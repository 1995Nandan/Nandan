package com.xworkz.myhome.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.myhome.entity.HomeEntity;

public class HomeDaoImpl implements HomeDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public boolean save(HomeEntity homeentity) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			entityManager.persist(homeentity);
			tx.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			entityManager.close();

		}

		return false;
	}

	@Override
	public HomeEntity findbyId(int Id) {    //READ OPERATION
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			HomeEntity entity = entityManager.find(HomeEntity.class, Id);
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
	public void updateHomeNameAndCreatedById(String NewHomeName, String NewCreatedBy, int Id) {  //UPDATE OPERATION
		EntityManager entityManager1 = entityManagerFactory.createEntityManager();
		EntityTransaction tx = entityManager1.getTransaction();
		tx.begin();
		try {
			HomeEntity entity = entityManager1.find(HomeEntity.class, Id);
			entity.setCreatedBy(NewCreatedBy);
			entity.setHomeName(NewHomeName);
			tx.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			entityManager1.close();
		}
	}

	@Override
	public void deleteById(int Id) { //DELETE OPERATION
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		try {
			HomeEntity entity = entityManager.find(HomeEntity.class, Id);

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
