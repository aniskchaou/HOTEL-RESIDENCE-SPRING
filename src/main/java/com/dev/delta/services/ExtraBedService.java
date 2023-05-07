package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.ExtraBed;
import com.dev.delta.repositories.ExtraBedRepository;

@Service
public class ExtraBedService {

	/**
	 * extraBedRepository
	 */
	@Autowired
	private ExtraBedRepository extraBedRepository;

	/**
	 * getExtraBeds
	 * 
	 * @return
	 */
	public List<ExtraBed> getExtraBeds() {
		return extraBedRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return extraBedRepository.count();
	}

	/**
	 * save
	 * 
	 * @param extraBed
	 */
	public void save(ExtraBed extraBed) {
		extraBedRepository.save(extraBed);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<ExtraBed> findById(int id) {
		return extraBedRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		extraBedRepository.delete(extraBedRepository.findById(id).get());
	}
}
