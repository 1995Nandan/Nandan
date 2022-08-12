package com.xworkz.oyo.entity;

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
@Table(name = "oyo_info")
@NoArgsConstructor
@AllArgsConstructor

public class OyoEntity implements Serializable{
	@Id
	@Column(name = "Id")
	private int Id;
	@Column(name = "HotelName")
	private String HotelName;
	@Column(name = "Location")
	private String Location;
	@Column(name = "CheckInTime")
	private LocalTime CheckInTime;
	@Column(name = "CheckOutTime")
	private LocalTime CheckOutTime;
	@Column(name = "CostPerDay")
	private Double CostPerDay;
	@Column(name = "CreatedBy")
	private String CreatedBy;
	@Column(name = "CreateDate")
	private LocalDate CreateDate;
	@Column(name = "UpdatedBy")
	private String UpdatedBy;
	@Column(name = "UpdateDate")
	private LocalDate UpdateDate;
}
