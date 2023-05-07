package com.dev.delta.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dev.delta.entities.LaundryItem;
import com.dev.delta.i18n.entities.LaundryItemI18n;
import com.dev.delta.i18n.repositories.LaundryItemI18nRepository;
import com.dev.delta.services.InformationService;
import com.dev.delta.services.LaundryItemService;
import com.dev.delta.util.UIMenuHeaderUtil;

@Controller
public class LaundryItemController {

	@Autowired
	private LaundryItemService laundryItemService;

	@Autowired
	InformationService informationService;

	@Autowired
	LaundryItemI18nRepository laundryItemI18nRepository;

	@Autowired
	UIMenuHeaderUtil menuHeaderUtil;

	@GetMapping("/add-laundryitem")
	public String getaddLaundryItem(Model model) {
		List<LaundryItem> laundryItems = laundryItemService.getLaundryItems();
		String lang = informationService.getSeletedLang();
		LaundryItemI18n cityI18n = laundryItemI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "laundryitem/add";
	}

	/**
	 * getLaundryItems
	 * 
	 * @param model
	 * @return
	 */

	@GetMapping("/laundryitems")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String getLaundryItems(Model model) {
		List<LaundryItem> laundryItems = laundryItemService.getLaundryItems();
		model.addAttribute("items", laundryItems);
		String lang = informationService.getSeletedLang();
		LaundryItemI18n cityI18n = laundryItemI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "laundryitem/laundryitems";
	}

	/**
	 * addLaundryItem
	 * 
	 * @param laundryItem
	 * @return
	 */
	@PostMapping("/addlaundryitem")

	public String addLaundryItem(LaundryItem laundryItem) {
		laundryItemService.save(laundryItem);

		return "redirect:/laundryitems";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/editlaundryitem/{id}")
	public String findById(@PathVariable("id") Long id, Model model) {
		LaundryItem laundryItem = laundryItemService.findById(id);
		model.addAttribute("item", laundryItem);
		String lang = informationService.getSeletedLang();
		LaundryItemI18n cityI18n = laundryItemI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "laundryitem/edit";
	}

	/**
	 * updateLaundryItem
	 * 
	 * @param id
	 * @param laundryItem
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatelaundryitem/{id}")
	public String updateLaundryItem(@PathVariable("id") long id, @Validated LaundryItem laundryItem,
			BindingResult result, Model model) {

		laundryItemService.save(laundryItem);
		return "redirect:/laundryitems";
	}

	/**
	 * deleteLaundryItem
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletelaundryitem/{id}")
	@Transactional
	public String deleteLaundryItem(@PathVariable("id") Long id) {
		laundryItemService.delete(id);
		return "redirect:/laundryitems";
	}
}
