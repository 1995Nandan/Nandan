package com.xworkz.entity;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "freedom_fighters")

public class FreedomEntity extends ParentEntity {
	// @GenericGenerator(name = "MyProjects", strategy = "Increment")
//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Id

	private Integer Id;
	private String Name;
	private LocalDateTime DOB;
	private LocalDateTime DOD;
	private String Gender;
	private String Location;

	public FreedomEntity(Integer id, String name, LocalDateTime dOB, LocalDateTime dOD, String gender, String location,
			String CreatedBy, LocalDateTime CreateDate, String UpdatedBy, LocalDateTime UpdateDate) {
		super(CreatedBy, CreateDate, UpdatedBy, UpdateDate);
		this.Id = id;
		this.Name = name;
		this.DOB = dOB;
		this.DOD = dOD;
		this.Gender = gender;
		this.Location = location;

	}

}
