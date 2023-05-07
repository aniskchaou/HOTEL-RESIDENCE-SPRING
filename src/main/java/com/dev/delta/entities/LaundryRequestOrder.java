package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LaundryRequestOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@ManyToOne
	@JoinColumn(name = "customer_id")
	Customer customer;
	String status;
	String date;
	String laundryitem;

	public LaundryRequestOrder() {
		// TODO Auto-generated constructor stub
	}

	public String getLaundryitem() {
		return laundryitem;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setLaundryitem(String laundryitem) {
		this.laundryitem = laundryitem;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
