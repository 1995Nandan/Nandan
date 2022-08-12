package com.xworkz.flight.entity;

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
@Table(name = "flight_info")

public class FlightEntity implements Serializable {

	@Id
	@Column(name = "Id")
	private int Id;
	@Column(name = "FlightName")
	private String FlightName;
	@Column(name = "Source")
	private String Source;
	@Column(name = "Destination")
	private String Destination;
	@Column(name = "TakeOffTime")
	private LocalTime TakeOffTime;
	@Column(name = "LandingTime")
	private LocalTime LandingTime;
	@Column(name = "CreatedBy")
	private String CreatedBy;
	@Column(name = "CreateDate")
	private LocalDate CreateDate;
	@Column(name = "UpdatedBy")
	private String UpdatedBy;
	@Column(name = "UpdateDate")
	private LocalDate UpdateDate;

}
