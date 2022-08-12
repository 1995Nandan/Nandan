package com.xworkz.politician.dao;

import java.util.Collections;
import java.util.List;

import com.xworkz.politician.dto.PoliticianDTO;

import lombok.Builder.Default;

interface PoliticianDAO {

	Boolean saveDetails(PoliticianDTO dto);

	PoliticianDTO findById(Integer id);

	default void test() {
		System.out.println("default impl of test");
	}

	PoliticianDTO findByIdPresident(Integer id, String president);

	PoliticianDTO findByIdPresidentAndName(Integer id, String president, String name);

	PoliticianDTO findByIdAndName(Integer id, String name);

	String findNameById(Integer id);

	String findPresidentByIdAndName(Integer id, String name);

	int getTotal();

	PoliticianDTO findPartyNameByMaxMembers();

	default List<PoliticianDTO> findAll() {
		return Collections.EMPTY_LIST;
	}

	default List<String> findAllPartyName() {
		return null;
	}

	default List<Integer> findAllIds() {
		return null;

	}

	default List<Object> findAllNoOfMembersAndTotalBudgetAndPartyName() {
		return null;

	}

}
