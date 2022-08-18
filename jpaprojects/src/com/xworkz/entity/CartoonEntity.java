package com.xworkz.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString(callSuper = true)
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "cartoon_info")
@NamedQueries({ @NamedQuery(name = "findByName", query = "SELECT cart from CartoonEntity cart where cart.Name=:nm"),

		@NamedQuery(name = "total", query = "SELECT  count(*) from CartoonEntity "),

		@NamedQuery(name = "findByMaxCreatedDate", query = "select max(CreatedDate) from CartoonEntity"),

		@NamedQuery(name = "findByNameAndCountryAndGenderAndAuthor", query = "select cart from CartoonEntity cart where cart.Name=:nm and cart.Country=:ct and cart.Gender=:gr and cart.Author=:ar"),

		@NamedQuery(name = "findAuthorByName", query = "SELECT cart.Author from CartoonEntity cart where cart.Name=:nm"),

		@NamedQuery(name = "findNameAndCountryByAuthor", query = "SELECT cart.Name,Country from CartoonEntity cart where cart.Author=:ar"),

		@NamedQuery(name = "findCreatedDateByAuthor", query = "SELECT cart.CreatedDate from CartoonEntity cart where cart.Author=:ar"),

		@NamedQuery(name = "updateAuthorByName", query = "update  CartoonEntity cart set cart.Author=:ar where cart.Name=:nm"),

		@NamedQuery(name = "updateTypeByName", query = "update  CartoonEntity cart set cart.Type=:tp where cart.Name=:nm"),

		@NamedQuery(name = "deleteByName", query = "delete from CartoonEntity cart where cart.Name=:nm"),

		@NamedQuery(name = "findAll", query = "select cart from CartoonEntity cart"),

		@NamedQuery(name = "findAllByAuthor", query = "select cart from CartoonEntity cart where cart.Author=:ar"),

		@NamedQuery(name = "findAllByAuthorAndGender", query = "select cart from CartoonEntity cart where cart.Author=:ar and cart.Gender=:gr"),

		@NamedQuery(name = "findAllName", query = "select cart.Name from CartoonEntity cart"),

		@NamedQuery(name = "findAllCountry", query = "select cart.Country from CartoonEntity cart"),

		@NamedQuery(name = "findAllNameAndCountry", query = "select cart.Name,Country from CartoonEntity cart"),

		@NamedQuery(name = "findAllNameAndCountryAndAuthor", query = "select cart.Name,Country,Author from CartoonEntity cart"), })

public class CartoonEntity extends ParentEntity {
	@GenericGenerator(name = "boss", strategy = "increment")
	@GeneratedValue(generator = "boss")
	@Id

	private Integer Cid;
	private String Name;
	private String Country;
	private String Gender;
	private String Author;
	private String Type;

	public CartoonEntity(String CreatedBy, LocalDateTime CreateDate, String UpdatedBy, LocalDateTime UpdateDate,
			String name, String country, String gender, String author, String type) {
		super(CreatedBy, CreateDate, UpdatedBy, UpdateDate);
		this.Name = name;
		this.Country = country;
		this.Gender = gender;
		this.Author = author;
		this.Type = type;
	}

}
