package com.xworkz.job.dto;

import java.io.Serializable;

import com.xworkz.job.constant.Designation;
import com.xworkz.job.constant.Qualification;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class JobDto implements Serializable{
	
	private Integer id;
	private Designation designation=Designation.DEFAULT;
	private Double salaryPackage;
	private Qualification qualification=Qualification.DEFAULT;
	private Double percentate;
	private Boolean fresher;
	
		

}
