package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.FoodCategory;
import com.dev.delta.repositories.FoodCategoryRepository;

@Service
public class FoodCategoryService {

	/**
	 * foodCategoryRepository
	 */
	@Autowired
	private FoodCategoryRepository foodCategoryRepository;

	/**
	 * getFoodCategorys
	 * 
	 * @return
	 */
	public List<FoodCategory> getFoodCategorys() {
		return foodCategoryRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return foodCategoryRepository.count();
	}

	/**
	 * save
	 * 
	 * @param foodCategory
	 */
	public void save(FoodCategory foodCategory) {
		foodCategoryRepository.save(foodCategory);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<FoodCategory> findById(long id) {
		return foodCategoryRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		foodCategoryRepository.delete(foodCategoryRepository.findById(id).get());
	}
}
