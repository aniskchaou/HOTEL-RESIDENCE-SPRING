package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.HouseKeepingItem;
import com.dev.delta.repositories.HouseKeepingItemRespository;

@Service
public class HouseKeepingItemService {

	/**
	 * houseKeepingItemRepository
	 */
	@Autowired
	private HouseKeepingItemRespository houseKeepingItemRepository;

	/**
	 * getHouseKeepingItems
	 * 
	 * @return
	 */
	public List<HouseKeepingItem> getHouseKeepingItems() {
		return houseKeepingItemRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return houseKeepingItemRepository.count();
	}

	/**
	 * save
	 * 
	 * @param houseKeepingItem
	 */
	public void save(HouseKeepingItem houseKeepingItem) {
		houseKeepingItemRepository.save(houseKeepingItem);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<HouseKeepingItem> findById(long id) {
		return houseKeepingItemRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		houseKeepingItemRepository.delete(houseKeepingItemRepository.findById(id).get());
	}
}
