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

import com.dev.delta.entities.FoodCategory;
import com.dev.delta.i18n.entities.FoodCategoryI18n;
import com.dev.delta.i18n.repositories.FoodCategoryI18nRepository;
import com.dev.delta.services.FoodCategoryService;
import com.dev.delta.services.InformationService;
import com.dev.delta.util.UIMenuHeaderUtil;

@Controller
public class FoodCategoryController {
	/**
	 * foodCategoryService
	 */
	@Autowired
	private FoodCategoryService foodCategoryService;

	@Autowired
	FoodCategoryI18nRepository foodCategoryI18nRepository;

	@Autowired
	InformationService informationService;

	@Autowired
	UIMenuHeaderUtil menuHeaderUtil;

	@GetMapping("/add-foodcategory")
	public String getaddAmenity(Model model) {
		String lang = informationService.getSeletedLang();
		FoodCategoryI18n cityI18n = foodCategoryI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "foodcategory/add";
	}

	/**
	 * getFoodCategorys
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/foodcategories")
	public String getFoodCategorys(Model model) {
		List<FoodCategory> foodCategorys = foodCategoryService.getFoodCategorys();

		model.addAttribute("items", foodCategorys);
		String lang = informationService.getSeletedLang();
		FoodCategoryI18n cityI18n = foodCategoryI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "foodcategory/foodcategories";
	}

	/**
	 * addFoodCategory
	 * 
	 * @param foodCategory
	 * @return
	 */
	@PostMapping("/addfoodcategory")

	public String addFoodCategory(FoodCategory foodCategory) {
		foodCategoryService.save(foodCategory);
		return "redirect:/foodcategories";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/editfoodcategory/{id}")
	public String findById(@PathVariable("id") long id, Model model) {
		FoodCategory foodCategory = foodCategoryService.findById(id).get();
		model.addAttribute("item", foodCategory);
		String lang = informationService.getSeletedLang();
		FoodCategoryI18n cityI18n = foodCategoryI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "foodcategory/edit";
	}

	/**
	 * updateFoodCategory
	 * 
	 * @param id
	 * @param foodCategory
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatefoodcategory/{id}")
	public String updateFoodCategory(@PathVariable("id") long id, @Validated FoodCategory foodCategory,
			BindingResult result, Model model) {

		foodCategoryService.save(foodCategory);
		return "redirect:/foodcategories";
	}

	/**
	 * deleteFoodCategory
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletefoodcategory/{id}")
	@Transactional
	public String deleteFoodCategory(@PathVariable("id") Long id) {
		foodCategoryService.delete(id);
		return "redirect:/foodcategories";
	}

}
