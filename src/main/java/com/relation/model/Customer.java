package com.relation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String address;
	
}
