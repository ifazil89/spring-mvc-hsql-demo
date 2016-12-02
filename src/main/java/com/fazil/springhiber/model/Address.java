package com.fazil.springhiber.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS")
public class Address {

	@Id
	private long id;
	
	private UserDetail userDetail;
	
	@Column(name="ADDRESS_LINE1")
	private String addressLine1;
	
	@Column(name="ADDRESS_LINE2")
	private String addressLine2;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="STATE")
	private String state;
}
