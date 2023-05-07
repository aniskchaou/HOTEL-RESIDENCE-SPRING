package com.dev.delta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.HouseKeepingRequestOrder;
import com.dev.delta.repositories.HouseKeepingRequestRepository;

@Service
public class HouseKeepingRequestOrderService {

	@Autowired
	private HouseKeepingRequestRepository houseKeepingRepository;

	/**
	 * getFoodOrders
	 * 
	 * @return
	 */
	public List<HouseKeepingRequestOrder> gethousekeepingRequest() {
		return houseKeepingRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return houseKeepingRepository.count();
	}

}
