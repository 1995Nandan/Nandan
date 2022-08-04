package com.xworkz.politician.dao;

import com.xowrkz.politician.dto.PoliticianDTO;

public interface PoliticianDAO {

	public Boolean saveDetails(PoliticianDTO dto);

	public PoliticianDTO findById(Integer id);

	public PoliticianDTO findByIdPresident(Integer id, String president);

	public PoliticianDTO findByIdPresidentAndName(Integer id, String president, String name);

	public PoliticianDTO findByIdAndName(Integer id, String name);

	public PoliticianDTO findNameById(Integer id);

	public PoliticianDTO findPresidentByIdAndName(Integer id, String name);

	public int getTotal();

	public PoliticianDTO findParentByMaxMembers();

}
