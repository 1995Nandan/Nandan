package com.xworkz.runnable;

import java.time.LocalDateTime;

import javax.persistence.Entity;

import com.xowrkz.dao.CartoonDao;
import com.xowrkz.dao.CartoonImpl;
import com.xworkz.entity.CartoonEntity;

public class CartoonDaoRunner {
	public static void main(String[] args) {
		CartoonEntity cartoonEntity1 = new CartoonEntity("Nandan", LocalDateTime.now(), "Nandan", LocalDateTime.now(),
				"Tom And Jerry", "India", "Male", "Manoj", "Comedy");

		CartoonEntity cartoonEntity2 = new CartoonEntity("Nandan", LocalDateTime.now(), "Nandan", LocalDateTime.now(),
				"MickeyMouse", "India", "Male", "Darshan", "Fighting");
		CartoonEntity cartoonEntity3 = new CartoonEntity("Nandan", LocalDateTime.now(), "Nandan", LocalDateTime.now(),
				"Doraemon", "India", "Male", "Saran", "Comedy");
		CartoonEntity cartoonEntity4 = new CartoonEntity("Nandan", LocalDateTime.now(), "Nandan", LocalDateTime.now(),
				"ChotaBheem", "India", "Male", "Saran", "Comedy");

		CartoonEntity cartoonEntity5 = new CartoonEntity("Nandan", LocalDateTime.now(), "Nandan", LocalDateTime.now(),
				"MrBean", "India", "Male", "Manoj", "Comedy");

		CartoonEntity cartoonEntity6 = new CartoonEntity("Nandan", LocalDateTime.now(), "Nandan", LocalDateTime.now(),
				"PockeyMan", "India", "Male", "Manoj", "Fighting");

		CartoonEntity cartoonEntity7 = new CartoonEntity("Nandan", LocalDateTime.now(), "Nandan", LocalDateTime.now(),
				"Benton", "India", "Male", "Manoj", "Comedy");

		CartoonEntity cartoonEntity8 = new CartoonEntity("Nandan", LocalDateTime.now(), "Nandan", LocalDateTime.now(),
				"PowerRangers", "India", "Male", "Arjun", "Fighting");

		CartoonEntity cartoonEntity9 = new CartoonEntity("Nandan", LocalDateTime.now(), "Nandan", LocalDateTime.now(),
				"Naruto", "India", "Male", "Sarath", "Comedy");
		CartoonEntity cartoonEntity10 = new CartoonEntity("Nandan", LocalDateTime.now(), "Nandan", LocalDateTime.now(),
				"Sataman", "India", "Male", "Kalyan", "Comedy");

		CartoonEntity cartoonEntity11 = new CartoonEntity("Nandan", LocalDateTime.now(), "Nandan", LocalDateTime.now(),
				"TomAndJerry", "India", "Male", "Hanumanth", "Comedy");

		CartoonDao dao = new CartoonImpl();

		/*
		 * boolean save =dao.save(cartoonEntity1); dao.save(cartoonEntity2);
		 * dao.save(cartoonEntity3); dao.save(cartoonEntity4); dao.save(cartoonEntity5);
		 * dao.save(cartoonEntity6); dao.save(cartoonEntity7); dao.save(cartoonEntity8);
		 * dao.save(cartoonEntity9); dao.save(cartoonEntity10);
		 * dao.save(cartoonEntity11);
		 * 
		 * System.out.println(save);
		 */

		// CartoonEntity entity =dao.findByName("MickeyMouse");

		// System.out.println(entity);

		// dao.total();

		// dao.findByMaxCreatedDate();

		// CartoonEntity entity =
		// dao.findByNameAndCountryAndGenderAndAuthor("MickeyMouse", "India", "Male",
		// "Darshan");
		// System.out.println(entity);

		// String string = dao.findAuthorByName("PowerRangers");
		// System.out.println(string);

		// Object[] object =dao.findNameAndCountryByAuthor("Arjun");
		// System.out.println(object[0]); System.out.println(object[1]);

		// dao.deleteByName("Tom And Jerry");

		// LocalDateTime date = dao.findCreatedDateByAuthor("Hanumanth");
		// System.out.println(date);

		// dao.updateAuthorByName("Raghu", "Doraemon");
		// dao.updateTypeByName("Sentiment", "ChotaBheem");
		// dao.deleteByName("Sataman");

	}

}
