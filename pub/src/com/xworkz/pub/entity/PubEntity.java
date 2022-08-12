package com.xworkz.pub.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "pub_info")
@AllArgsConstructor
@NoArgsConstructor

public class PubEntity implements Serializable {

	@Id
	@Column(name = "Id")
	private int Id;
	@Column(name = "Name")
	private String Name;
	@Column(name = "Location")
	private String Location;
	@Column(name = "CheckInTime")
	private LocalTime CheckInTime;
	@Column(name = "CheckOutTime")
	private LocalTime CheckOutTime;
	@Column(name = "CreatedBy")
	private String CreatedBy;
	@Column(name = "CreateDate")
	private LocalDate CreateDate;
	@Column(name = "UpdatedBy")
	private String UpdatedBy;
	@Column(name = "UpdateDate")
	private LocalDate Updatedate;

}
