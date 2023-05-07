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

import com.dev.delta.entities.HouseKeepingItem;
import com.dev.delta.i18n.entities.HouseKeepingItemI18n;
import com.dev.delta.i18n.repositories.HouseKeepingItemI18nRepository;
import com.dev.delta.services.HouseKeepingItemService;
import com.dev.delta.services.InformationService;
import com.dev.delta.util.UIMenuHeaderUtil;

@Controller
public class HouseKeepingItemController {
	/**
	 * houseKeepingItemService
	 */
	@Autowired
	private HouseKeepingItemService houseKeepingItemService;

	@Autowired
	HouseKeepingItemI18nRepository houseKeepingItemI18nRepository;

	@Autowired
	UIMenuHeaderUtil menuHeaderUtil;

	@Autowired
	InformationService informationService;

	@GetMapping("/add-housekeepingitem")
	public String getaddAmenity(Model model) {
		String lang = informationService.getSeletedLang();
		HouseKeepingItemI18n cityI18n = houseKeepingItemI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "housekeepingitem/add";
	}

	/**
	 * getHouseKeepingItems
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/housekeepingitems")
	public String getHouseKeepingItems(Model model) {
		List<HouseKeepingItem> houseKeepingItems = houseKeepingItemService.getHouseKeepingItems();

		model.addAttribute("items", houseKeepingItems);
		String lang = informationService.getSeletedLang();
		HouseKeepingItemI18n cityI18n = houseKeepingItemI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "housekeepingitem/housekeepingitems";
	}

	/**
	 * addHouseKeepingItem
	 * 
	 * @param houseKeepingItem
	 * @return
	 */
	@PostMapping("/addhousekeepingitem")

	public String addHouseKeepingItem(HouseKeepingItem houseKeepingItem) {
		houseKeepingItemService.save(houseKeepingItem);
		return "redirect:/housekeepingitems";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/edithousekeepingitem/{id}")
	public String findById(@PathVariable("id") long id, Model model) {
		HouseKeepingItem houseKeepingItem = houseKeepingItemService.findById(id).get();
		model.addAttribute("item", houseKeepingItem);
		String lang = informationService.getSeletedLang();
		HouseKeepingItemI18n cityI18n = houseKeepingItemI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "housekeepingitem/edit";
	}

	/**
	 * updateHouseKeepingItem
	 * 
	 * @param id
	 * @param houseKeepingItem
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatehousekeepingitem/{id}")
	public String updateHouseKeepingItem(@PathVariable("id") long id, @Validated HouseKeepingItem houseKeepingItem,
			BindingResult result, Model model) {

		houseKeepingItemService.save(houseKeepingItem);
		return "redirect:/housekeepingitems";
	}

	/**
	 * deleteHouseKeepingItem
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletehousekeepingitem/{id}")
	@Transactional
	public String deleteHouseKeepingItem(@PathVariable("id") Long id) {
		houseKeepingItemService.delete(id);
		return "redirect:/housekeepingitems";
	}
}
