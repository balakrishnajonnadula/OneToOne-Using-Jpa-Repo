package com.relation.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "belongings")
public class Belongings {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int belongingId;

	private String belongingName;

	@OneToOne(cascade = CascadeType.ALL)
	private Customer cus;

}
