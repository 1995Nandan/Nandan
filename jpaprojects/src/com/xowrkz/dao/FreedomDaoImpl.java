package com.xowrkz.dao;

import java.util.List;

import javax.naming.ldap.ManageReferralControl;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import static com.xowrkz.factory.Factory.*;
import com.xworkz.entity.FreedomEntity;

public class FreedomDaoImpl implements FreedomDao {
	EntityManagerFactory factory = getFactory();

	@Override
	public boolean saveAll(List<FreedomEntity> entities) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction entityTransaction = manager.getTransaction();
			entityTransaction.begin();
			for (FreedomEntity entityFreedomEntity : entities) {
				manager.persist(entityFreedomEntity);

			}
			entityTransaction.commit();
		}

		catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();

		}
		return FreedomDao.super.saveAll(entities);
	}
}
