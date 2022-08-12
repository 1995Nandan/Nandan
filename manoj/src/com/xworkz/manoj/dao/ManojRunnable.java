package com.xworkz.manoj.dao;

import com.xworkz.manoj.entity.ManojEntity;

public class ManojRunnable {
	public static void main(String[] args) {
		ManojEntity manoj = new ManojEntity(4, "Manoj", "M", 24, "BE",5.7D,65.5D);
		
		ManojDao dao=new ManojDaoImpl();
		boolean nan =dao.save(manoj);
		System.out.println("saved succsefully" +nan);
	}

}
