package com.xworkz.myhome.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name="home_info")
@AllArgsConstructor
@NoArgsConstructor

public class HomeEntity implements Serializable {
	
	@Id
	@Column(name = "Id")
	private int Id;
	@Column(name = "HomeName")
	private String HomeName;
	@Column(name = "TotalMembersOfHome")
	private int TotalMembersOfHome;
	@Column(name = "Male")
	private Double Male;
	@Column(name = "Female")
	private Double Female;
	@Column(name = "CreatedBy")
	private String CreatedBy;
	@Column(name = "CreateDate")
	private LocalDate CreateDate;
	@Column(name = "UpdatedBy")
	private String UpdatedBy;
	@Column(name = "UpdateDate")
	private LocalDate UpdateDate;


}
