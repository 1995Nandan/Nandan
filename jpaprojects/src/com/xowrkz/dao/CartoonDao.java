package com.xowrkz.dao;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;

import com.xworkz.entity.CartoonEntity;

public interface CartoonDao {

	boolean save(CartoonEntity entity);

	CartoonEntity findByName(String name);

	Integer total();

	CartoonEntity findByMaxCreatedDate();

	CartoonEntity findByNameAndCountryAndGenderAndAuthor(String name, String country, String gender, String author);

	String findAuthorByName(String name);

	Object[] findNameAndCountryByAuthor(String author);

	LocalDateTime findCreatedDateByAuthor(String author);

	void updateAuthorByName(String newAuthor, String name);

	void updateTypeByName(String newType, String name);

	void deleteByName(String name);

	List<CartoonEntity> findAll();

	List<CartoonEntity> findAllByAuthor(String author);

	List<CartoonEntity> findAllByAuthorAndGender(String author, String gender);

	List<String> findAllName();

	List<String> findAllCountry();

	List<Object[]> findAllNameAndCountry();

	 default  List<Object[]> findAllNameAndCountryAndAuthor() {
		return null;
	}
	}


