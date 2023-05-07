package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ExtraBedRequestOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@ManyToOne
	@JoinColumn(name = "room_id")
	Room room;
	String ExtraBed;
	String Comment;
	String status;
	String date;
	String price;

	@ManyToOne
	@JoinColumn(name = "customer_id")
	Customer customer;

	@ManyToOne
	@JoinColumn(name = "checkin_id")
	CheckIn checkin;

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public CheckIn getCheckin() {
		return checkin;
	}

	public void setCheckin(CheckIn checkin) {
		this.checkin = checkin;
	}

	public ExtraBedRequestOrder() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ExtraBedRequestOrder [id=" + id + ", room=" + room + ", ExtraBed=" + ExtraBed + ", Comment=" + Comment
				+ ", status=" + status + ", date=" + date + ", customer=" + customer + "]";
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public String getExtraBed() {
		return ExtraBed;
	}

	public void setExtraBed(String extraBed) {
		ExtraBed = extraBed;
	}

	public String getComment() {
		return Comment;
	}

	public void setComment(String comment) {
		Comment = comment;
	}

}
