package com.xworkz.manoj.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "manoj_info")
@AllArgsConstructor
@NoArgsConstructor

public class ManojEntity implements Serializable {

	@Id
	@Column(name = "Id")
	private int Id;
	@Column(name = "Name")
	private String Name;
	@Column(name = "Gender")
	private String Gender;
	@Column(name = "Age")
	private int Age;
	@Column(name = "Qualification")
	private String Qualification;
	@Column(name = "Hight")
	private Double Hight;
	@Column(name = "Weight")
	private Double Weight;

}
