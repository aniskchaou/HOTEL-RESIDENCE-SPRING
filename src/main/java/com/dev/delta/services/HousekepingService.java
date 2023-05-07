package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.HousekepingOrder;
import com.dev.delta.repositories.HousekepingRepository;

@Service
public class HousekepingService {

	/**
	 * housekeepingRepository
	 */
	@Autowired
	private HousekepingRepository housekeepingRepository;

	/**
	 * getHousekeepings
	 * 
	 * @return
	 */
	public List<HousekepingOrder> getHousekeepings() {
		return housekeepingRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return housekeepingRepository.count();
	}

	/**
	 * save
	 * 
	 * @param housekeeping
	 */
	public void save(HousekepingOrder housekeeping) {
		housekeepingRepository.save(housekeeping);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<HousekepingOrder> findById(int id) {
		return housekeepingRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		housekeepingRepository.delete(housekeepingRepository.findById(id).get());
	}
}
