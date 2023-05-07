package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class FoodOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@ManyToOne
	@JoinColumn(name = "room_id")
	Room room;
	String NoofPersons;
	String WaiterName;

	String FoodItem;

	@ManyToOne
	@JoinColumn(name = "checkin_id")
	CheckIn checkin;

	String price;

	public FoodOrder() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "FoodOrder [id=" + id + ", room=" + room + ", NoofPersons=" + NoofPersons + ", WaiterName=" + WaiterName
				+ ", FoodItem=" + FoodItem + ", checkin=" + checkin + ", price=" + price + "]";
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public CheckIn getCheckin() {
		return checkin;
	}

	public void setCheckin(CheckIn checkin) {
		this.checkin = checkin;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
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

	public String getWaiterName() {
		return WaiterName;
	}

	public void setWaiterName(String waiterName) {
		WaiterName = waiterName;
	}

	public String getFoodItem() {
		return FoodItem;
	}

	public void setFoodItem(String foodItem) {
		FoodItem = foodItem;
	}

}
