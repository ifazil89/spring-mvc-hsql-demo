package com.fazil.springhiber.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT")
public class Product {

	@Id
	private long id;
	
	@Column(name="CODE")
	private String productCode;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="CATEGORY_ID")
	private Category category;
	
	@Column(name="PRICE")
	private double price;
	
	@Column(name="DISCOUNT")
	private double discount;
	
	@Column(name="IMAGE_ID")
	private String imageId;
	
	private String quantity;
	
}
