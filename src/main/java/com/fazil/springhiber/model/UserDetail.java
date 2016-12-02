package com.fazil.springhiber.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_DETAIL")
public class UserDetail {

	@Id
	@Column(name="USER_ID")
	private long userId;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="MOBILE_NUMBER")
	private String mobileNumber;
	
	@Column(name="EMAIL_ID")
	private String emailId;
	
	private Address address;
	
	@Column(name="STATUS")
	private boolean status;
	
	@Column(name="CREATED_DATE")
	private Date createdDate;
	
	@Column(name="CREATED_BY")
	private String createdBy;
	
	@Column(name="MODIFIED_DATE")
	private Date modifiedDate;
	
	@Column(name="MODIFIED_BY")
	private String modifiedBy;
	
	
}
