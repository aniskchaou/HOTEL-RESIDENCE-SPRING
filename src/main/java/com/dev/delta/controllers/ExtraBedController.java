package com.dev.delta.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dev.delta.entities.ExtraBed;
import com.dev.delta.services.BedService;
import com.dev.delta.services.CustomerService;
import com.dev.delta.services.ExtraBedService;
import com.dev.delta.services.RoomService;
import com.dev.delta.services.RoomTypeService;

@Controller
public class ExtraBedController {
	/**
	 * extraBedService
	 */
	@Autowired
	private ExtraBedService extraBedService;

	@Autowired
	CustomerService customerService;

	@Autowired
	RoomService roomService;

	@Autowired
	BedService bedService;

	@Autowired
	RoomTypeService roomTypeService;

	@GetMapping("/add-extrabed")
	public String getaddExtraBed(Model model) {

		model.addAttribute("roomTypes", roomTypeService.getRoomTypes());
		model.addAttribute("customers", customerService.getCustomers());
		model.addAttribute("rooms", roomService.getRooms());
		model.addAttribute("beds", bedService.getBeds());

		return "extrabed/add";
	}

	/**
	 * getExtraBeds
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/extrabeds")
	public String getExtraBeds(Model model) {
		List<ExtraBed> extraBeds = extraBedService.getExtraBeds();

		model.addAttribute("items", extraBeds);

		return "extrabed/extrabeds";
	}

	/**
	 * addExtraBed
	 * 
	 * @param extraBed
	 * @return
	 */
	@PostMapping("/addextrabed")
	public String addExtraBed(ExtraBed extraBed) {
		extraBedService.save(extraBed);
		return "redirect:/extrabeds";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/editextrabed/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		ExtraBed extraBed = extraBedService.findById(id).get();
		model.addAttribute("item", extraBed);
		return "extrabed/edit";
	}

	/**
	 * updateExtraBed
	 * 
	 * @param id
	 * @param extraBed
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateextrabed/{id}")
	public String updateExtraBed(@PathVariable("id") long id, @Validated ExtraBed extraBed, BindingResult result,
			Model model) {

		extraBedService.save(extraBed);
		return "redirect:/extrabeds";
	}

	/**
	 * deleteExtraBed
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteextrabed/{id}")
	@Transactional
	public String deleteExtraBed(@PathVariable("id") Long id) {
		extraBedService.delete(id);
		return "redirect:/extrabeds";
	}
}
