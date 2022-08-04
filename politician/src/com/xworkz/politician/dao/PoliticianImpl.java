package com.xworkz.politician.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xowrkz.politician.dto.PoliticianDTO;
import com.xworkz.constant.PartyName;
import com.xworkz.constant.PartySymbol;

import static com.xworkz.constant.DBConnection.*;

public class PoliticianImpl implements PoliticianDAO {

	@Override
	public Boolean saveDetails(PoliticianDTO dto) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());

			String insert = "insert into politician_info.politician values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement stmt = connection.prepareStatement(insert);
			stmt.setInt(1, dto.getId());
			stmt.setString(2, dto.getName());
			stmt.setString(3, dto.getPartyName().getPartyName());
			stmt.setString(4, dto.getPartyPresident());
			stmt.setString(5, dto.getPartySymbol().getPartySymbol());
			stmt.setString(6, dto.getHeadQuaters());
			stmt.setString(7, dto.getPartyMembers());
			stmt.setString(8, dto.getPartyScheme());
			stmt.setDouble(9, dto.getPartyFunds());

			int noOfRowAffected = stmt.executeUpdate();
			// if(noOfRowAffected > 0)
			{
				System.out.println("The values inserted are:" + insert);
			}
			// else
			// System.out.println("values are not inserted");
			return noOfRowAffected == 1 ? true : false;

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}// FIRST METHOD COMPLETE

	@Override
	public PoliticianDTO findById(Integer id) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());

			String search = "select * from politician_info.politician where pid = ?";
			PreparedStatement stmt = connection.prepareStatement(search);
			stmt.setInt(1, id);

			ResultSet resultSet = stmt.executeQuery();
			while (resultSet.next()) {
				Integer pid = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String partyName = resultSet.getString(3);
				String partyPresident = resultSet.getString(4);
				String partySymbol = resultSet.getString(5);
				String headQuaters = resultSet.getString(6);
				String partyMembers = resultSet.getString(7);
				String partyScheme = resultSet.getString(8);
				Double partyFunds = resultSet.getDouble(9);

				PoliticianDTO politicianDTO = new PoliticianDTO();

				politicianDTO.setId(pid);
				politicianDTO.setName(name);
				politicianDTO.setPartyName(PartyName.getByParty(partyName));
				politicianDTO.setPartyPresident(partyPresident);
				politicianDTO.setPartySymbol(PartySymbol.getBySymbol(partySymbol));
				politicianDTO.setHeadQuaters(headQuaters);
				politicianDTO.setPartyMembers(partyMembers);
				politicianDTO.setPartyScheme(partyScheme);
				politicianDTO.setPartyFunds(partyFunds);
				return politicianDTO;

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return null;
	}// SECOND METHOD COMPLETED

	@Override
	public PoliticianDTO findByIdPresident(Integer id, String president) {

		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());

			String search = "select * from politician_info.politician where pid = ? and partypresident = ?";
			PreparedStatement stmt = connection.prepareStatement(search);
			stmt.setInt(1, id);
			stmt.setString(2, president);

			ResultSet resultSet = stmt.executeQuery();
			while (resultSet.next()) {
				Integer pid = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String partyName = resultSet.getString(3);
				String partyPresident = resultSet.getString(4);
				String partySymbol = resultSet.getString(5);
				String headQuaters = resultSet.getString(6);
				String partyMembers = resultSet.getString(7);
				String partyScheme = resultSet.getString(8);
				Double partyFunds = resultSet.getDouble(9);

				PoliticianDTO politicianDTO = new PoliticianDTO();

				politicianDTO.setId(pid);
				politicianDTO.setName(name);
				politicianDTO.setPartyName(PartyName.getByParty(partyName));
				politicianDTO.setPartyPresident(partyPresident);
				politicianDTO.setPartySymbol(PartySymbol.getBySymbol(partySymbol));
				politicianDTO.setHeadQuaters(headQuaters);
				politicianDTO.setPartyMembers(partyMembers);
				politicianDTO.setPartyScheme(partyScheme);
				politicianDTO.setPartyFunds(partyFunds);

				return politicianDTO;

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return null;
	}// THIRD METHOD COMPLETED

	@Override
	public PoliticianDTO findByIdPresidentAndName(Integer id, String president, String name) {

		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String search = "select * from politician_info.politician where pid = ? and partypresident = ? and politicianname = ?";
			PreparedStatement stmt = connection.prepareStatement(search);
			stmt.setInt(1, id);
			stmt.setString(2, president);
			stmt.setString(3, name);

			ResultSet resultSet = stmt.executeQuery();
			while (resultSet.next()) {
				Integer pid = resultSet.getInt(1);
				String name1 = resultSet.getString(2);
				String partyName = resultSet.getString(3);
				String partyPresident = resultSet.getString(4);
				String partySymbol = resultSet.getString(5);
				String headQuaters = resultSet.getString(6);
				String partyMembers = resultSet.getString(7);
				String partyScheme = resultSet.getString(8);
				Double partyFunds = resultSet.getDouble(9);

				PoliticianDTO politicianDTO = new PoliticianDTO();

				politicianDTO.setId(pid);
				politicianDTO.setName(name1);
				politicianDTO.setPartyName(PartyName.getByParty(partyName));
				politicianDTO.setPartyPresident(partyPresident);
				politicianDTO.setPartySymbol(PartySymbol.getBySymbol(partySymbol));
				politicianDTO.setHeadQuaters(headQuaters);
				politicianDTO.setPartyMembers(partyMembers);
				politicianDTO.setPartyScheme(partyScheme);
				politicianDTO.setPartyFunds(partyFunds);

				return politicianDTO;

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return null;
	}//FOURTH METHOD COMPLETED

	@Override
	public PoliticianDTO findByIdAndName(Integer id, String name) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			
			String search = "select * from politician_info.politician where pid = ? and politicianname = ?";
			PreparedStatement stmt = connection.prepareStatement(search);
			stmt.setInt(1, id);
			stmt.setString(2, name);

			ResultSet resultSet = stmt.executeQuery();
			while (resultSet.next()) {
				Integer pid = resultSet.getInt(1);
				String name1 = resultSet.getString(2);
				String partyName = resultSet.getString(3);
				String partyPresident = resultSet.getString(4);
				String partySymbol = resultSet.getString(5);
				String headQuaters = resultSet.getString(6);
				String partyMembers = resultSet.getString(7);
				String partyScheme = resultSet.getString(8);
				Double partyFunds = resultSet.getDouble(9);

				PoliticianDTO politicianDTO = new PoliticianDTO();

				politicianDTO.setId(pid);
				politicianDTO.setName(name1);
				politicianDTO.setPartyName(PartyName.getByParty(partyName));
				politicianDTO.setPartyPresident(partyPresident);
				politicianDTO.setPartySymbol(PartySymbol.getBySymbol(partySymbol));
				politicianDTO.setHeadQuaters(headQuaters);
				politicianDTO.setPartyMembers(partyMembers);
				politicianDTO.setPartyScheme(partyScheme);
				politicianDTO.setPartyFunds(partyFunds);

				return politicianDTO;

			}

			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}//FIFTH METHOD COMPLETED

	@Override
	public PoliticianDTO findNameById(Integer id) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			
			String search = "select 'name' from politician_info.politician where pid = ?";
			PreparedStatement stmt = connection.prepareStatement(search);
			stmt.setInt(1, id);
			
			
			ResultSet resultSet = stmt.executeQuery();
			while (resultSet.next()) {
				Integer pid = resultSet.getInt(1);
				String name1 = resultSet.getString(2);
				String partyName = resultSet.getString(3);
				String partyPresident = resultSet.getString(4);
				String partySymbol = resultSet.getString(5);
				String headQuaters = resultSet.getString(6);
				String partyMembers = resultSet.getString(7);
				String partyScheme = resultSet.getString(8);
				Double partyFunds = resultSet.getDouble(9);

				PoliticianDTO politicianDTO = new PoliticianDTO();

				politicianDTO.setId(pid);
				politicianDTO.setName(name1);
				politicianDTO.setPartyName(PartyName.getByParty(partyName));
				politicianDTO.setPartyPresident(partyPresident);
				politicianDTO.setPartySymbol(PartySymbol.getBySymbol(partySymbol));
				politicianDTO.setHeadQuaters(headQuaters);
				politicianDTO.setPartyMembers(partyMembers);
				politicianDTO.setPartyScheme(partyScheme);
				politicianDTO.setPartyFunds(partyFunds);

				return politicianDTO;

			}
			

			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return null;
	}//SIXTH METHOD COMLETED

	@Override
	public PoliticianDTO findPresidentByIdAndName(Integer id, String name) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String search = "select * from politician_info.politician where pid = ? and politicianname = ?";
			PreparedStatement stmt = connection.prepareStatement(search);
			stmt.setInt(1,id);
			stmt.setString(2,name);
			
			
			
			ResultSet resultSet = stmt.executeQuery();
			while (resultSet.next()) {
				Integer pid = resultSet.getInt(1);
				String name1 = resultSet.getString(2);
				String partyName = resultSet.getString(3);
				String partyPresident = resultSet.getString(4);
				String partySymbol = resultSet.getString(5);
				String headQuaters = resultSet.getString(6);
				String partyMembers = resultSet.getString(7);
				String partyScheme = resultSet.getString(8);
				Double partyFunds = resultSet.getDouble(9);
				PoliticianDTO politicianDTO = new PoliticianDTO();

				politicianDTO.setId(pid);
				politicianDTO.setName(name1);
				politicianDTO.setPartyName(PartyName.getByParty(partyName));
				politicianDTO.setPartyPresident(partyPresident);
				politicianDTO.setPartySymbol(PartySymbol.getBySymbol(partySymbol));
				politicianDTO.setHeadQuaters(headQuaters);
				politicianDTO.setPartyMembers(partyMembers);
				politicianDTO.setPartyScheme(partyScheme);
				politicianDTO.setPartyFunds(partyFunds);

				return politicianDTO;

			}
			

			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	
		return null;
	}//SEVENTH METHOD COMLETED

	@Override
	public int getTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PoliticianDTO findParentByMaxMembers() {
		// TODO Auto-generated method stub
		return null;
	}

}
