package com.dev.delta.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.dev.delta.i18n.entities.UIHeaderI18n;
import com.dev.delta.i18n.entities.UIMenuI18n;
import com.dev.delta.i18n.repositories.UIHeaderI18nRepository;
import com.dev.delta.i18n.repositories.UIMenuI18nRepository;
import com.dev.delta.repositories.ExtraBedRequestRepository;
import com.dev.delta.repositories.FoodOrderRequestRepository;
import com.dev.delta.repositories.HouseKeepingRequestRepository;
import com.dev.delta.repositories.LaundryRequestOrderRepository;
import com.dev.delta.repositories.MessageRepository;
import com.dev.delta.repositories.NotificationRepository;
import com.dev.delta.services.InformationService;

@Service
public class UIMenuHeaderUtil {

	@Autowired
	InformationService informationService;

	@Autowired
	UIMenuI18nRepository menuI18nRepository;

	@Autowired
	FoodOrderRequestRepository foodOrderRequestRepository;

	@Autowired
	HouseKeepingRequestRepository houseKeepingRequestRepository;

	@Autowired
	LaundryRequestOrderRepository laundryRequestOrderRepository;

	@Autowired
	MessageRepository messageRepository;

	@Autowired
	NotificationRepository notificationRepository;

	@Autowired
	ExtraBedRequestRepository extraBedRequestRepository;

	@Autowired
	UIHeaderI18nRepository headerI18nRepository;

	@Autowired
	NotificationRepository notificationRepository2;

	public void getMenuHeader(Model model) {
		String lang = informationService.getSeletedLang();
		UIMenuI18n menu = menuI18nRepository.findByLang(lang);
		UIHeaderI18n header = headerI18nRepository.findByLang(lang);
		model.addAttribute("messageNB", messageRepository.count());
		model.addAttribute("notificationNB", notificationRepository.count());
		model.addAttribute("foodorderNB", foodOrderRequestRepository.count());
		model.addAttribute("extrabedorderNB", extraBedRequestRepository.count());
		model.addAttribute("housekeepingorderNB", houseKeepingRequestRepository.count());
		model.addAttribute("laundryorderNB", laundryRequestOrderRepository.count());
		model.addAttribute("foods", foodOrderRequestRepository.findAll());
		model.addAttribute("extrabeds", extraBedRequestRepository.findAll());
		model.addAttribute("housekeepings", houseKeepingRequestRepository.findAll());
		model.addAttribute("laundries", laundryRequestOrderRepository.findAll());
		model.addAttribute("menu", menu);
		model.addAttribute("header", header);
		model.addAttribute("notifications", notificationRepository.findAll());
		model.addAttribute("messages", messageRepository.findAll());
	}

}
