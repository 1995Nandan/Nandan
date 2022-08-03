package com.xworkz.job.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.job.constant.Designation;
import com.xworkz.job.constant.Qualification;
import com.xworkz.job.dto.JobDto;
import static com.xworkz.job.constant.MySqlProperties.*;

public class JobDaoImpl implements JobDao {

	@Override
	public boolean save(JobDto jobDto) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String insertSql = "insert into job_application_info values(?,?,?,?,?,?)";
			PreparedStatement statment = connection.prepareStatement(insertSql);
			statment.setInt(1, jobDto.getId());
			statment.setString(2, jobDto.getDesignation().getTittle());
			statment.setDouble(3, jobDto.getSalaryPackage());
			statment.setString(4, jobDto.getQualification().getCombination());
			statment.setDouble(5, jobDto.getPercentate());
			statment.setBoolean(6, jobDto.getFresher());
			int rowsAffected=statment.executeUpdate();
			System.out.println(rowsAffected);

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;
	}

	@Override
	public JobDto findByIdAndDesignation(Integer id, String designation) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String SelectSql="Select * from job.job_application_info where jid=? and designation=?";
			PreparedStatement statment=connection.prepareStatement(SelectSql);
			statment.setInt(1, id);
			statment.setString(2,designation );
			ResultSet resultSet = statment.executeQuery();
			while(resultSet.next()) {
			int pk=resultSet.getInt(1);
			String designantion=resultSet.getString(2);
			Double salary=resultSet.getDouble(3);
			String qualification=resultSet.getString(4);
			Double percentage=resultSet.getDouble(5);
			Boolean fresher=resultSet.getBoolean(6);
			
		
		JobDto dto = new JobDto();
			dto.setId(pk);
			dto.setDesignation(Designation.getByValue(designation));
			dto.setSalaryPackage(salary);
			dto.setQualification(Qualification.getByValue(qualification));
			dto.setPercentate(percentage);
			dto.setFresher(fresher);
			return dto;
			
				
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}


		return null;
	}

}
