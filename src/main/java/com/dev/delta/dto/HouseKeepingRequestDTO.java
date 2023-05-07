package com.dev.delta.dto;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.HouseKeepingRequestI18nRepository;
import com.dev.delta.repositories.HouseKeepingRequestRepository;

@Service
public class HouseKeepingRequestDTO implements DTO {

	@Autowired
	HouseKeepingRequestRepository houseKeepingRequestOrderRepository;

	@Autowired
	HouseKeepingRequestI18nRepository houseKeepingRequestI18nRepository;

	@Override
	public void populate() {
		houseKeepingRequestI18n.setCustomer("Customer");
		houseKeepingRequestI18n.setDate("Date");
		houseKeepingRequestI18n.setLangI18n("EN");
		houseKeepingRequestI18n.setRoom("Room");
		houseKeepingRequestI18n.setStatus("Status");
		houseKeepingRequestI18nRepository.save(houseKeepingRequestI18n);

		houseKeepingRequestI18n2.setCustomer("Kunde");
		houseKeepingRequestI18n2.setDate("Datum");
		houseKeepingRequestI18n2.setLangI18n("DE");
		houseKeepingRequestI18n2.setRoom("Zimmer");
		houseKeepingRequestI18n2.setStatus("Status");
		houseKeepingRequestI18nRepository.save(houseKeepingRequestI18n2);

		houseKeepingRequestI18n3.setCustomer("Cliente");
		houseKeepingRequestI18n3.setDate("Fecha");
		houseKeepingRequestI18n3.setLangI18n("ES");
		houseKeepingRequestI18n3.setRoom("Habitación");
		houseKeepingRequestI18n3.setStatus("Estado");
		houseKeepingRequestI18nRepository.save(houseKeepingRequestI18n3);

		houseKeepingRequestI18n4.setCustomer("Client");
		houseKeepingRequestI18n4.setDate("Date");
		houseKeepingRequestI18n4.setLangI18n("FR");
		houseKeepingRequestI18n4.setRoom("Chambre");
		houseKeepingRequestI18n4.setStatus("Statut");
		houseKeepingRequestI18nRepository.save(houseKeepingRequestI18n4);

		houseKeepingRequestI18n5.setCustomer("العميل");
		houseKeepingRequestI18n5.setDate("التاريخ");
		houseKeepingRequestI18n5.setLangI18n("AR");
		houseKeepingRequestI18n5.setRoom("الغرفة");
		houseKeepingRequestI18n5.setStatus("الحالة");
		houseKeepingRequestI18nRepository.save(houseKeepingRequestI18n5);

		houseKeepingRequestOrder.setCustomer(customer);
		houseKeepingRequestOrder.setDate(new Date().toString());
		houseKeepingRequestOrder.setRoom(room);
		houseKeepingRequestOrder.setStatus("Status");
		houseKeepingRequestOrderRepository.save(houseKeepingRequestOrder);

	}

}
