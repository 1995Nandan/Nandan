package com.xworkz.resort.dao;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.resort.entity.ResortEntity;

public class DaoRunnable {

	public static void main(String[] args) {
		ResortEntity resort= new ResortEntity();

		resort.setId(1);
		resort.setName("Amblee Resort");
		resort.setLocation("Mysore");
		resort.setCheckInTime(LocalTime.of(12, 0));
		resort.setCheckOutTime(LocalTime.of(11, 0));
		resort.setCreateBy("Nandan");
		resort.setCreateDate(LocalDate.now());
		resort.setOwner("Manoj");
		resort.setUpdateDate(LocalDate.now());
		resort.setPricePerDay(20000D);

		ResortDAO resortDAO=new ResortDaoImpl();
		boolean saved	= resortDAO.save(resort);
		System.out.println(saved);
	}
}
