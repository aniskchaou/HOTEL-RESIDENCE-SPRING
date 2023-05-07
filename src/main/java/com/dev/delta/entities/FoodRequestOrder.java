package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class FoodRequestOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String NoofPersons;

	String FoodItem;
	String status;
	String date;
	@ManyToOne
	@JoinColumn(name = "customer_id")
	Customer customer;
	@ManyToOne
	@JoinColumn(name = "room_id")
	Room room;
	@ManyToOne
	@JoinColumn(name = "checkin_id")
	CheckIn checkin;

	public CheckIn getCheckin() {
		return checkin;
	}

	public void setCheckin(CheckIn checkin) {
		this.checkin = checkin;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return "FoodRequestOrder [id=" + id + ", NoofPersons=" + NoofPersons + ", FoodItem=" + FoodItem + ", status="
				+ status + ", date=" + date + ", customer=" + customer + ", room=" + room + ", checkin=" + checkin
				+ "]";
	}

	public FoodRequestOrder() {
		// TODO Auto-generated constructor stub
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNoofPersons() {
		return NoofPersons;
	}

	public void setNoofPersons(String noofPersons) {
		NoofPersons = noofPersons;
	}

	public String getFoodItem() {
		return FoodItem;
	}

	public void setFoodItem(String foodItem) {
		FoodItem = foodItem;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
