package com.dev.delta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.ExtraBedRequestOrder;
import com.dev.delta.repositories.ExtraBedRequestRepository;

@Service
public class ExtraBedRequestService {

	@Autowired
	ExtraBedRequestRepository extraBedRequestService;

	public List<ExtraBedRequestOrder> getExtraBedRequest() {
		return extraBedRequestService.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return extraBedRequestService.count();
	}
}
