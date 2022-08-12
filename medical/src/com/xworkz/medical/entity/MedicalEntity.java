package com.xworkz.medical.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "medical_info")

public class MedicalEntity implements Serializable {

	@Id
	@Column(name = "Id")
	private int Id;
	@Column(name = "Name")
	private String Name;
	@Column(name = "Location")
	private String Location;
	@Column(name = "OpenTime")
	private LocalTime OpenTime;
	@Column(name = "CloseTime")
	private LocalTime CloseTime;
	@Column(name = "CreatedBy")
	private String CreatedBy;
	@Column(name = "CreateDate")
	private LocalDate CreateDate;
	@Column(name = "UpdatedBy")
	private String UpdatedBy;
	@Column(name = "UpdateDate")
	private LocalDate UpdateDate;
}
