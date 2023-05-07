package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class HousekepingOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@ManyToOne
	@JoinColumn(name = "room_id")
	Room Room;
	String HousekeepingItem;
	String HousekeepingStatus;
	String Remark;
	String AssignedTo;

	public HousekepingOrder() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Room getRoom() {
		return Room;
	}

	public void setRoom(Room room) {
		Room = room;
	}

	public String getHousekeepingItem() {
		return HousekeepingItem;
	}

	public void setHousekeepingItem(String housekeepingItem) {
		HousekeepingItem = housekeepingItem;
	}

	public String getHousekeepingStatus() {
		return HousekeepingStatus;
	}

	public void setHousekeepingStatus(String housekeepingStatus) {
		HousekeepingStatus = housekeepingStatus;
	}

	public String getRemark() {
		return Remark;
	}

	public void setRemark(String remark) {
		Remark = remark;
	}

	public String getAssignedTo() {
		return AssignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		AssignedTo = assignedTo;
	}

}
