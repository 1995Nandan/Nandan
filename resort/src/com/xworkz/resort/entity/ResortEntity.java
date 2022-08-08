package com.xworkz.resort.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.*;

@Data
@AllArgsConstructor
@Entity
@Table(name = "resort_info")

public class ResortEntity implements Serializable {
	@Column(name = "Id")
	private int id;
	@Column(name = "Name")
	private String name;
	@Column(name = "Location")
	private String location;
	@Column(name = "CheckInTime")
	private LocalTime checkInTime;
	@Column(name = "CheckOutTime")
	private LocalTime checkOutTime;
	@Column(name = "CreateBy")
	private String createBy;
	@Column(name = "CreateDate")
	private LocalDate createDate;
	@Column(name = "UpdateDate")
	private LocalDate updateDate;
	@Column(name = "Owner")
	private String owner;
	@Column(name = "PricePerDay")
	private double pricePerDay;
}
