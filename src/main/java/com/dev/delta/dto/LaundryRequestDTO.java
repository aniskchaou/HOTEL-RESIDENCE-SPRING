package com.dev.delta.dto;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.LaundryRequestI18nRepository;
import com.dev.delta.repositories.LaundryRequestOrderRepository;

@Service
public class LaundryRequestDTO implements DTO {

	@Autowired
	LaundryRequestI18nRepository laundryRequestI18nRepository;

	@Autowired
	LaundryRequestOrderRepository laundryRequestOrderRepository;

	@Override
	public void populate() {
		laundryRequestI18n.setCustomer("Kunde");
		laundryRequestI18n.setDate("Datum");
		laundryRequestI18n.setLangI18n("DE");
		laundryRequestI18n.setLaundryitem("Wäscheartikel");
		laundryRequestI18n.setStatus("Status");
		laundryRequestI18nRepository.save(laundryRequestI18n);

		laundryRequestI18n2.setCustomer("Customer");
		laundryRequestI18n2.setDate("Date");
		laundryRequestI18n2.setLangI18n("EN");
		laundryRequestI18n2.setLaundryitem("Laundry Items");
		laundryRequestI18n2.setStatus("Accepted");
		laundryRequestI18nRepository.save(laundryRequestI18n2);

		laundryRequestI18n3.setCustomer("Cliente");
		laundryRequestI18n3.setDate("Fecha");
		laundryRequestI18n3.setLangI18n("ES");
		laundryRequestI18n3.setLaundryitem("Artículos de lavandería");
		laundryRequestI18n3.setStatus("Aceptado");
		laundryRequestI18nRepository.save(laundryRequestI18n3);

		laundryRequestI18n4.setCustomer("Client");
		laundryRequestI18n4.setDate("Date");
		laundryRequestI18n4.setLangI18n("FR");
		laundryRequestI18n4.setLaundryitem("Articles de blanchisserie");
		laundryRequestI18n4.setStatus("Accepté");
		laundryRequestI18nRepository.save(laundryRequestI18n4);

		laundryRequestI18n5.setCustomer("العميل");
		laundryRequestI18n5.setDate("التاريخ");
		laundryRequestI18n5.setLangI18n("AR");
		laundryRequestI18n5.setLaundryitem("مواد غسيل");
		laundryRequestI18n5.setStatus("مقبول");
		laundryRequestI18nRepository.save(laundryRequestI18n5);

		laundryRequestOrder.setCustomer(customer);
		laundryRequestOrder.setDate(new Date().toString());
		laundryRequestOrder.setLaundryitem("T-shirt");
		laundryRequestOrder.setStatus("Accepted");
		laundryRequestOrderRepository.save(laundryRequestOrder);

	}

}
