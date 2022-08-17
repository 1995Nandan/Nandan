package com.xworkz.entity;

import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@MappedSuperclass

public class ParentEntity {
	private String CreatedBy;
	private LocalDateTime CreatedDate;
	private String UpdatedBy;
	private LocalDateTime UpdatedDate;

}
