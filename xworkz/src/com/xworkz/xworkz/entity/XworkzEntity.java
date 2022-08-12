package com.xworkz.xworkz.entity;

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
@Table(name="xworkz_info")
@AllArgsConstructor
@NoArgsConstructor

public class XworkzEntity implements Serializable{
	
	@Id
	@Column(name = "Id")
	private int Id;
	@Column(name = "TraineeName")
	private String TraineeName;
	@Column(name = "Subject")
	private String Subject;
	@Column(name = "Duration")
	private String  Duration;
	@Column(name = "Fee")
	private Double Fee;
	@Column(name = "CreatedBy")
	private String CreatedBy;
	@Column(name = "CreateDate")
	private LocalDate CreateDate;
	@Column(name = "UpdatedBy")
	private String UpdatedBy;
	@Column(name = "UpdateDate")
	private LocalDate UpdateDate;

}