package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.FoodOrder;
import com.dev.delta.repositories.FoodOrderRespository;

@Service
public class FoodOrderService {

	/**
	 * foodOrderRepository
	 */
	@Autowired
	private FoodOrderRespository foodOrderRepository;

	/**
	 * getFoodOrders
	 * 
	 * @return
	 */
	public List<FoodOrder> getFoodOrders() {
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
	public void save(FoodOrder foodOrder) {
		foodOrderRepository.save(foodOrder);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<FoodOrder> findById(int id) {
		return foodOrderRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		foodOrderRepository.delete(foodOrderRepository.findById(id).get());
	}
}
