package com.dev.delta.controllers;

import java.util.Date;
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

import com.dev.delta.entities.FoodOrder;
import com.dev.delta.entities.Invoice;
import com.dev.delta.repositories.InvoiceRepository;
import com.dev.delta.repositories.ServiceRepository;
import com.dev.delta.services.CheckInService;
import com.dev.delta.services.CustomerService;
import com.dev.delta.services.FoodOrderService;
import com.dev.delta.services.FoodService;

@Controller
public class FoodOrderController {
	/**
	 * foodOrderService
	 */
	@Autowired
	private FoodOrderService foodOrderService;

	@Autowired
	private CustomerService customerService;

	@Autowired
	private FoodService foodService;

	@Autowired
	private CheckInService checkInService;

	@Autowired
	ServiceRepository serviceRepository;

	Invoice invoice;

	@Autowired
	InvoiceRepository invoiceRepository;

	@GetMapping("/add-foodorder")
	public String getaddAmenity(Model model) {
		model.addAttribute("customers", customerService.getCustomers());
		model.addAttribute("foods", foodService.getFoods());

		return "foodorder/add";
	}

	/**
	 * getFoodOrders
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/foodorders")
	public String getFoodOrders(Model model) {
		List<FoodOrder> foodOrders = foodOrderService.getFoodOrders();
		model.addAttribute("items", foodOrders);

		return "foodorder/foodorders";
	}

	/**
	 * addFoodOrder
	 * 
	 * @param foodOrder
	 * @return
	 */
	@PostMapping("/addfoodorder")
	public String addFoodOrder(FoodOrder foodOrder) {
		foodOrderService.save(foodOrder);
		invoice = new Invoice();
		invoice.setCheckIn(foodOrder.getCheckin());
		invoice.setCreateAt(new Date().toString());
		invoice.setPrice(foodOrder.getPrice());
		invoice.setService("Order food " + foodOrder.getFoodItem());
		invoiceRepository.save(invoice);
		// return "redirect:/checkins";
		return "redirect:/checkins";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/editfoodorder/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		FoodOrder foodOrder = foodOrderService.findById(id).get();
		model.addAttribute("item", foodOrder);
		return "foodorder/edit";
	}

	/**
	 * updateFoodOrder
	 * 
	 * @param id
	 * @param foodOrder
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatefoodorder/{id}")
	public String updateFoodOrder(@PathVariable("id") long id, @Validated FoodOrder foodOrder, BindingResult result,
			Model model) {

		foodOrderService.save(foodOrder);
		return "redirect:/foodorders";
	}

	/**
	 * deleteFoodOrder
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletefoodorder/{id}")
	@Transactional
	public String deleteFoodOrder(@PathVariable("id") Long id) {
		foodOrderService.delete(id);
		return "redirect:/foodorders";
	}

}
