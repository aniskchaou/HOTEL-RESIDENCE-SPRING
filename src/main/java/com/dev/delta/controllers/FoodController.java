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

import com.dev.delta.entities.Food;
import com.dev.delta.i18n.entities.FoodI18n;
import com.dev.delta.i18n.repositories.FoodI18nRepository;
import com.dev.delta.services.FoodCategoryService;
import com.dev.delta.services.FoodService;
import com.dev.delta.services.InformationService;
import com.dev.delta.util.UIMenuHeaderUtil;

@Controller
public class FoodController {
	/**
	 * foodService
	 */
	@Autowired
	private FoodService foodService;

	@Autowired
	private FoodCategoryService foodCategoryService;

	@Autowired
	InformationService informationService;

	@Autowired
	FoodI18nRepository foodI18nRepository;

	@Autowired
	UIMenuHeaderUtil menuHeaderUtil;

	@GetMapping("/add-food")
	public String getaddFood(Model model) {
		model.addAttribute("foodCategories", foodCategoryService.getFoodCategorys());
		String lang = informationService.getSeletedLang();
		FoodI18n cityI18n = foodI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "food/add";
	}

	/**
	 * getFoods
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/foods")
	public String getFoods(Model model) {
		List<Food> foods = foodService.getFoods();
		model.addAttribute("items", foods);
		String lang = informationService.getSeletedLang();
		FoodI18n cityI18n = foodI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "food/foods";
	}

	/**
	 * addFood
	 * 
	 * @param food
	 * @return
	 */
	@PostMapping("/addfood")
	public String addFood(Food food) {
		foodService.save(food);
		return "redirect:/foods";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/editfood/{id}")
	public String findById(@PathVariable("id") long id, Model model) {
		model.addAttribute("foodCategories", foodCategoryService.getFoodCategorys());
		Food food = foodService.findById(id).get();
		model.addAttribute("item", food);
		String lang = informationService.getSeletedLang();
		FoodI18n cityI18n = foodI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "food/edit";
	}

	/**
	 * updateFood
	 * 
	 * @param id
	 * @param food
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatefood/{id}")
	public String updateFood(@PathVariable("id") long id, @Validated Food food, BindingResult result, Model model) {

		foodService.save(food);
		return "redirect:/foods";
	}

	/**
	 * deleteFood
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletefood/{id}")
	@Transactional
	public String deleteFood(@PathVariable("id") Long id) {
		foodService.delete(id);
		return "redirect:/foods";
	}
}
