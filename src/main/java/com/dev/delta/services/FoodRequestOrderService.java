package com.dev.delta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.FoodRequestOrder;
import com.dev.delta.repositories.FoodOrderRequestRepository;

@Service
public class FoodRequestOrderService {

	/**
	 * foodOrderRepository
	 */
	@Autowired
	private FoodOrderRequestRepository foodOrderRepository;

	/**
	 * getFoodOrders
	 * 
	 * @return
	 */
	public List<FoodRequestOrder> getFoodRequest() {
		return foodOrderRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return foodOrderRepository.count();
	}

	/**
	 * save
	 * 
	 * @param foodOrder
	 */
	public void save(FoodRequestOrder foodOrder) {
		foodOrderRepository.save(foodOrder);
	}

	public void delete(Long id) {
		// foodOrderRepository.delete(foodOrderRepository.findById(id).get());
	}
}
