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

import com.dev.delta.entities.HousekepingOrder;
import com.dev.delta.services.HousekepingService;
import com.dev.delta.services.RoomService;

@Controller
public class HousekepingController {
	/**
	 * housekeepingService
	 */
	@Autowired
	private HousekepingService housekeepingService;

	@Autowired
	private RoomService roomService;

	@GetMapping("/add-housekeeping")
	public String getaddHouseKeeping(Model model) {
		model.addAttribute("rooms", roomService.getRooms());

		return "housekeeping/add";
	}

	/**
	 * getHousekeepings
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/housekeepings")
	public String getHousekeepings(Model model) {
		List<HousekepingOrder> housekeepings = housekeepingService.getHousekeepings();

		model.addAttribute("items", housekeepings);

		return "housekeeping/housekeepings";
	}

	/**
	 * addHousekeeping
	 * 
	 * @param housekeeping
	 * @return
	 */
	@PostMapping("/addhousekeeping")

	public String addHousekeeping(HousekepingOrder housekeeping) {
		housekeepingService.save(housekeeping);
		return "redirect:/housekeepings";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/edithousekeeping/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		HousekepingOrder housekeeping = housekeepingService.findById(id).get();
		model.addAttribute("item", housekeeping);
		return "housekeeping/edit";
	}

	/**
	 * updateHousekeeping
	 * 
	 * @param id
	 * @param housekeeping
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatehousekeeping/{id}")
	public String updateHousekeeping(@PathVariable("id") long id, @Validated HousekepingOrder housekeeping,
			BindingResult result, Model model) {

		housekeepingService.save(housekeeping);
		return "redirect:/housekeepings";
	}

	/**
	 * deleteHousekeeping
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletehousekeeping/{id}")
	@Transactional
	public String deleteHousekeeping(@PathVariable("id") Long id) {
		housekeepingService.delete(id);
		return "redirect:/housekeepings";
	}
}
