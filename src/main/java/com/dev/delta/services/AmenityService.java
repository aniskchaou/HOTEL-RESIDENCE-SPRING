package com.dev.delta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Amenity;
import com.dev.delta.repositories.AmenityRepository;

@Service
public class AmenityService {

	/**
	 * amenityRepository
	 */
	@Autowired
	private AmenityRepository amenityRepository;

	/**
	 * getAmenitys
	 * 
	 * @return
	 */
	public List<Amenity> getAmenitys() {
		return amenityRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return amenityRepository.count();
	}

	/**
	 * save
	 * 
	 * @param amenity
	 */
	public void save(Amenity amenity) {
		amenityRepository.save(amenity);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Amenity findById(Long id) {
		return amenityRepository.findById(id).get();
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		amenityRepository.delete(amenityRepository.findById(id).get());
	}
}
