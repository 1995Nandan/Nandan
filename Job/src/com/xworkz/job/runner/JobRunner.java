package com.xworkz.job.runner;

import com.xworkz.job.constant.Designation;
import com.xworkz.job.constant.Qualification;
import com.xworkz.job.dao.JobDao;
import com.xworkz.job.dao.JobDaoImpl;
import com.xworkz.job.dto.JobDto;

public class JobRunner {
	public static void main(String[] args) {
		JobDto dto = new JobDto(1, Designation.SOFTWARE_DEVELOPER, 2000000.00, Qualification.BE, 65.00, true);
		JobDto dto1 = new JobDto(2, Designation.SYSTEM_ADMIN, 2000000.00, Qualification.BSC, 65.00, true);
		JobDto dto2 = new JobDto(3, Designation.HUMAN_RESOURCES, 2000000.00, Qualification.BCOM, 65.00, true);
		JobDto dto3 = new JobDto(4, Designation.SYSTEM_ENGINEER, 2000000.00, Qualification.BE, 65.00, true);
		JobDto dto4 = new JobDto(5, Designation.TECHNICAL_SUPPORT, 2000000.00, Qualification.BCOM, 65.00, true);
		JobDto dto5 = new JobDto(6, Designation.TESTING_ENGINEER, 2000000.00, Qualification.BCOM, 65.00, true);
		JobDto dto6 = new JobDto(7, Designation.DEFAULT, 2000000.00, Qualification.DEFAULT, 65.00, true);
		
		JobDao dao = new JobDaoImpl();
	
		
		//dao.save(dto);
		//dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		dao.save(dto4);
		dao.save(dto5);
		dao.save(dto6);
	JobDto id  = dao.findByIdAndDesignation(1,"software developer");
	System.out.println(id);
	
		JobDto id1=dao.findByIdAndDesignationAndQualification(2, "sytem admin","BSC");
		System.out.println(id1);
	}
}
