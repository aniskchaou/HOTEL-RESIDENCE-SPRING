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

import com.dev.delta.entities.Amenity;
import com.dev.delta.i18n.entities.AmenityI18n;
import com.dev.delta.i18n.repositories.AmenityI18nRepository;
import com.dev.delta.i18n.repositories.UIMenuI18nRepository;
import com.dev.delta.services.AmenityService;
import com.dev.delta.services.InformationService;
import com.dev.delta.util.UIMenuHeaderUtil;

@Controller
public class AmenityController {
	/**
	 * amenityService
	 */
	@Autowired
	private AmenityService amenityService;

	@Autowired
	private AmenityI18nRepository amenityI18nRepository;

	@Autowired
	private UIMenuI18nRepository uiMenuI18nRepository;

	@Autowired
	InformationService informationService;

	@Autowired
	AmenityI18nRepository amenityI18nRepository2;

	@Autowired
	UIMenuHeaderUtil menuHeaderUtil;

	@GetMapping("/add-amenity")
	public String getaddAmenity(Model model) {
		List<Amenity> amenitys = amenityService.getAmenitys();
		String lang = informationService.getSeletedLang();
		AmenityI18n amenityI18n = amenityI18nRepository2.findByLanguageI18n(lang);
		model.addAttribute("itemI18n", amenityI18n);
		menuHeaderUtil.getMenuHeader(model);

		return "amenity/add";
	}

	/**
	 * getAmenitys
	 * 
	 * @param model
	 * @return
	 */

	@GetMapping("/amenities")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String getAmenitys(Model model) {
		List<Amenity> amenitys = amenityService.getAmenitys();
		model.addAttribute("items", amenitys);
		// List<AmenityI18n> amenitiesI18n=amenityI18nRepository.findAll();
		// model.addAttribute("itemsI18n", amenitiesI18n);
		String lang = informationService.getSeletedLang();
		AmenityI18n amenityI18n = amenityI18nRepository2.findByLanguageI18n(lang);
		model.addAttribute("itemI18n", amenityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "amenity/amenities";
	}

	/**
	 * addAmenity
	 * 
	 * @param amenity
	 * @return
	 */
	@PostMapping("/addamenity")

	public String addAmenity(Amenity amenity) {
		amenityService.save(amenity);
		return "redirect:/amenities";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/editamenity/{id}")
	public String findById(@PathVariable("id") Long id, Model model) {
		Amenity amenity = amenityService.findById(id);
		model.addAttribute("item", amenity);
		String lang = informationService.getSeletedLang();
		AmenityI18n amenityI18n = amenityI18nRepository2.findByLanguageI18n(lang);
		model.addAttribute("itemI18n", amenityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "amenity/edit";
	}

	/**
	 * updateAmenity
	 * 
	 * @param id
	 * @param amenity
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateamenity/{id}")
	public String updateAmenity(@PathVariable("id") long id, @Validated Amenity amenity, BindingResult result,
			Model model) {

		amenityService.save(amenity);
		return "redirect:/amenities";
	}

	/**
	 * deleteAmenity
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteamenity/{id}")
	@Transactional
	public String deleteAmenity(@PathVariable("id") Long id) {
		amenityService.delete(id);
		return "redirect:/amenities";
	}

}
