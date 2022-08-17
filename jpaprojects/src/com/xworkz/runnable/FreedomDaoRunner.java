package com.xworkz.runnable;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


import com.xowrkz.dao.FreedomDao;
import com.xowrkz.dao.FreedomDaoImpl;
import com.xworkz.entity.FreedomEntity;

public class FreedomDaoRunner {

	public static void main(String[] args) {
		FreedomEntity entity = new FreedomEntity(1, "SangolliRayanna", LocalDateTime.now(), LocalDateTime.now(), "Male",
				"Location", "Nandan", LocalDateTime.now(), "Nandan", LocalDateTime.now());


		FreedomEntity entity1 = new FreedomEntity(2, "SangolliRayanna", LocalDateTime.now(), LocalDateTime.now(), "Male",
				"Location", "Nandan", LocalDateTime.now(), "Nandan", LocalDateTime.now());
		FreedomDao dao = new FreedomDaoImpl();

		List<FreedomEntity> list = new ArrayList<FreedomEntity>();
		list.add(entity);
		list.add(entity1);
		boolean save	=dao.saveAll(list);
		System.out.println(save);
	}

}