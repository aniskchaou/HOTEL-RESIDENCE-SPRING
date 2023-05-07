package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Food;
import com.dev.delta.repositories.FoodRepository;

@Service
public class FoodService {

	/**
	 * foodRepository
	 */
	@Autowired
	private FoodRepository foodRepository;

	/**
	 * getFoods
	 * 
	 * @return
	 */
	public List<Food> getFoods() {
		return foodRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return foodRepository.count();
	}

	/**
	 * save
	 * 
	 * @param food
	 */
	public void save(Food food) {
		foodRepository.save(food);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<Food> findById(long id) {
		return foodRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		foodRepository.delete(foodRepository.findById(id).get());
	}
}
