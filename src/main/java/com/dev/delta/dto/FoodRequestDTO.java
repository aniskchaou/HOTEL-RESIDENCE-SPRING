package com.dev.delta.dto;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.FoodRequestI18nRepository;
import com.dev.delta.repositories.FoodOrderRequestRepository;

@Service
public class FoodRequestDTO implements DTO {

	@Autowired
	FoodRequestI18nRepository foodRequestI18nRepository;

	@Autowired
	FoodOrderRequestRepository foodOrderRequestRepository;

	@Override
	public void populate() {

		foodRequestI18n.setCustomer("Customer");
		foodRequestI18n.setDate("Date");
		foodRequestI18n.setFoodItem("Food Item");
		foodRequestI18n.setNoofPersons("Persons");
		foodRequestI18n.setRoom("Room");
		foodRequestI18n.setStatus("Status");
		foodRequestI18n.setLangI18n("EN");
		foodRequestI18nRepository.save(foodRequestI18n);

		foodRequestI18n2.setCustomer("Kunde");
		foodRequestI18n2.setDate("Datum");
		foodRequestI18n2.setFoodItem("Lebensmittel");
		foodRequestI18n2.setNoofPersons("Personen");
		foodRequestI18n2.setRoom("Zimmer");
		foodRequestI18n2.setStatus("Status");
		foodRequestI18n2.setLangI18n("DE");
		foodRequestI18nRepository.save(foodRequestI18n2);

		foodRequestOrder.setCustomer(customer);
		foodRequestOrder.setDate(new Date().toString());
		foodRequestOrder.setFoodItem("Pizza");
		foodRequestOrder.setNoofPersons("Persons");
		foodRequestOrder.setRoom(room);
		foodRequestOrder.setStatus("Status");
		foodOrderRequestRepository.save(foodRequestOrder);

		foodRequestI18n3.setCustomer("Cliente");
		foodRequestI18n3.setDate("Fecha");
		foodRequestI18n3.setFoodItem("Elemento alimenticio");
		foodRequestI18n3.setNoofPersons("Personas");
		foodRequestI18n3.setRoom("Habitación");
		foodRequestI18n3.setStatus("Estado");
		foodRequestI18n3.setLangI18n("ES");
		foodRequestI18nRepository.save(foodRequestI18n3);

		foodRequestI18n4.setCustomer("Client");
		foodRequestI18n4.setDate("Date");
		foodRequestI18n4.setFoodItem("Article alimentaire");
		foodRequestI18n4.setNoofPersons("Personnes");
		foodRequestI18n4.setRoom("Chambre");
		foodRequestI18n4.setStatus("Statut");
		foodRequestI18n4.setLangI18n("FR");
		foodRequestI18nRepository.save(foodRequestI18n4);

		foodRequestI18n5.setCustomer("العميل");
		foodRequestI18n5.setDate("التاريخ");
		foodRequestI18n5.setFoodItem("مادة غذائية");
		foodRequestI18n5.setNoofPersons("الأشخاص");
		foodRequestI18n5.setRoom("الغرفة");
		foodRequestI18n5.setStatus("الحالة");
		foodRequestI18n5.setLangI18n("AR");
		foodRequestI18nRepository.save(foodRequestI18n5);

	}

}
