package com.xowrkz.dao;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xowrkz.factory.Factory;
import com.xworkz.entity.CartoonEntity;

public class CartoonImpl implements CartoonDao {
	EntityManagerFactory factory = Factory.getFactory();

	@Override
	public boolean save(CartoonEntity entity) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(entity);
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			manager.close();

		}

		return false;
	}

	@Override
	public CartoonEntity findByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("nm", name);
			Object object = query.getSingleResult();
			if (object != null) {
				CartoonEntity cartoonEntity = (CartoonEntity) object;
				return cartoonEntity;

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();

		}
		return null;
	}

	@Override
	public Integer total() {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("total");

			Object object = query.getSingleResult();
			System.out.println(object);
			if (object != null) {
				Integer integer = (Integer) object;
				return integer;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public CartoonEntity findByMaxCreatedDate() {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByMaxCreatedDate");
			Object object = query.getSingleResult();
			System.out.println(object);
			if (object != null) {
				CartoonEntity cartoonEntity = (CartoonEntity) object;
				return cartoonEntity;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public CartoonEntity findByNameAndCountryAndGenderAndAuthor(String name, String country, String gender,
			String author) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByNameAndCountryAndGenderAndAuthor");
			query.setParameter("nm", name);
			query.setParameter("ct", country);
			query.setParameter("gr", gender);
			query.setParameter("ar", author);

			Object object = query.getSingleResult();
			if (object != null) {
				CartoonEntity cartoonEntity = (CartoonEntity) object;
				return cartoonEntity;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public String findAuthorByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAuthorByName");
			query.setParameter("nm", name);
			Object object = query.getSingleResult();
			if (object != null) {
				String string = (String) object;
				return string;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();

		}
		return null;
	}

	@Override
	public Object[] findNameAndCountryByAuthor(String author) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findNameAndCountryByAuthor");
			query.setParameter("ar", author);
			Object object = query.getSingleResult();

			if (object != null) {

				Object[] result = (Object[]) object;
				return result;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}

		return null;
	}

	@Override
	public LocalDateTime findCreatedDateByAuthor(String author) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findCreatedDateByAuthor");
			query.setParameter("ar", author);
			Object object = query.getSingleResult();
			if (object != null) {
				LocalDateTime localDateTime = (LocalDateTime) object;

				return localDateTime;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public void updateAuthorByName(String newAuthor, String name) {
		EntityManager manager = factory.createEntityManager();

		EntityTransaction tx = manager.getTransaction();

		try {
			tx.begin();
			Query query = manager.createNamedQuery("updateAuthorByName");
			query.setParameter("ar", newAuthor);
			query.setParameter("nm", name);

			query.executeUpdate();
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}

	}

	@Override
	public void updateTypeByName(String newType, String name) {
		EntityManager manager = factory.createEntityManager();

		EntityTransaction tx = manager.getTransaction();

		try {
			tx.begin();
			Query query = manager.createNamedQuery("updateTypeByName");
			query.setParameter("tp", newType);
			query.setParameter("nm", name);

			query.executeUpdate();
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}

	}

	@Override
	public void deleteByName(String name) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();

		try {
			tx.begin();
			Query query = manager.createNamedQuery("deleteByName");
			query.setParameter("nm", name);
			query.executeUpdate();
			tx.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
		}

		finally {
			manager.close();

		}

	}

}
