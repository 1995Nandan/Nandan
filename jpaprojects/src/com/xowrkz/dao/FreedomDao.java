package com.xowrkz.dao;

import java.util.List;

import com.xworkz.entity.FreedomEntity;

public interface FreedomDao {
	
	default boolean saveAll(List<FreedomEntity> entities) {

		return false;
	}

}
