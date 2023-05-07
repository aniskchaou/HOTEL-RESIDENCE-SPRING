package com.dev.delta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.LaundryRequestOrder;
import com.dev.delta.repositories.LaundryRequestOrderRepository;

@Service
public class LaundryRequestOrderService {

	@Autowired
	LaundryRequestOrderRepository laundryRequestOrder;

	public List<LaundryRequestOrder> getLaundriesRequest() {
		return laundryRequestOrder.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return laundryRequestOrder.count();
	}
}
