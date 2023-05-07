package com.dev.delta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Bed;
import com.dev.delta.repositories.BedRepository;

@Service
public class BedService {

	@Autowired
	private BedRepository bedRepository;

	/**
	 * getBeds
	 * 
	 * @return
	 */
	public List<Bed> getBeds() {
		return bedRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return bedRepository.count();
	}

	/**
	 * save
	 * 
	 * @param bed
	 */
	public void save(Bed bed) {
		bedRepository.save(bed);
	}

	public Bed findById(Long id) {
		// TODO Auto-generated method stub
		return bedRepository.findById(id).get();
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		bedRepository.deleteById(id);
	}
}
