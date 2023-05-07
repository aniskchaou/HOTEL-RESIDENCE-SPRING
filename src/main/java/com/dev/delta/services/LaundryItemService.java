package com.dev.delta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.LaundryItem;
import com.dev.delta.repositories.LaundryItemRepository;

@Service
public class LaundryItemService {
	/**
	 * laundryItemRepository
	 */
	@Autowired
	private LaundryItemRepository laundryItemRepository;

	/**
	 * getLaundryItems
	 * 
	 * @return
	 */
	public List<LaundryItem> getLaundryItems() {
		return laundryItemRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return laundryItemRepository.count();
	}

	/**
	 * save
	 * 
	 * @param laundryItem
	 */
	public void save(LaundryItem laundryItem) {
		laundryItemRepository.save(laundryItem);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public LaundryItem findById(Long id) {
		return laundryItemRepository.findById(id).get();
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		laundryItemRepository.delete(laundryItemRepository.findById(id).get());
	}
}
