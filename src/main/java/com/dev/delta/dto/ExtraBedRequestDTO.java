package com.dev.delta.dto;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.ExtraBedRequestI18nRepository;
import com.dev.delta.repositories.ExtraBedRequestRepository;

@Service
public class ExtraBedRequestDTO implements DTO {

	@Autowired
	ExtraBedRequestI18nRepository extraBedRequestI18nRepository;

	@Autowired
	ExtraBedRequestRepository extraBedRequestRepository;

	@Override
	public void populate() {
		extraBedRequestOrder.setComment("");
		extraBedRequestOrder.setCustomer(customer);
		extraBedRequestOrder.setDate(new Date().toString());
		extraBedRequestOrder.setExtraBed("2");
		extraBedRequestOrder.setRoom(room);
		extraBedRequestOrder.setStatus("Accepted");
		extraBedRequestRepository.save(extraBedRequestOrder);

		extraBedRequestI18n.setExtraBed("Extra Bed");
		extraBedRequestI18n.setComment("Comment");
		;
		extraBedRequestI18n.setDate("Date");
		extraBedRequestI18n.setLangI18n("EN");
		extraBedRequestI18n.setCustomer("Customer");
		extraBedRequestI18n.setRoom("Room");
		extraBedRequestI18n.setStatus("Status");
		extraBedRequestI18nRepository.save(extraBedRequestI18n);

		extraBedRequestI18n2.setExtraBed("Extrabett");
		extraBedRequestI18n2.setComment("Kommentare");
		;
		extraBedRequestI18n2.setDate("Date");
		extraBedRequestI18n2.setLangI18n("DE");
		extraBedRequestI18n2.setCustomer("Kunde");
		extraBedRequestI18n2.setRoom("Zimmer");
		extraBedRequestI18n2.setStatus("Status");
		extraBedRequestI18nRepository.save(extraBedRequestI18n2);

		extraBedRequestI18n3.setExtraBed("Cama adicional");
		extraBedRequestI18n3.setComment("Comentario");
		;
		extraBedRequestI18n3.setDate("date");
		extraBedRequestI18n3.setLangI18n("ES");
		extraBedRequestI18n3.setCustomer("Cliente");
		extraBedRequestI18n3.setRoom("Habitación");
		extraBedRequestI18n3.setStatus("Estado");
		extraBedRequestI18nRepository.save(extraBedRequestI18n3);

		extraBedRequestI18n4.setExtraBed("Lit supplémentaire");
		extraBedRequestI18n4.setComment("Commentaire");
		extraBedRequestI18n4.setDate("date");
		extraBedRequestI18n4.setLangI18n("FR");
		extraBedRequestI18n4.setCustomer("Client");
		extraBedRequestI18n4.setRoom("Chambre");
		extraBedRequestI18n4.setStatus("Statut");
		extraBedRequestI18nRepository.save(extraBedRequestI18n4);

		extraBedRequestI18n5.setExtraBed("سرير إضافي");
		extraBedRequestI18n5.setComment("تعليق");
		extraBedRequestI18n5.setDate("date");
		extraBedRequestI18n5.setLangI18n("AR");
		extraBedRequestI18n5.setCustomer("العميل");
		extraBedRequestI18n5.setRoom("الغرفة");
		extraBedRequestI18n5.setStatus("الحالة");
		extraBedRequestI18nRepository.save(extraBedRequestI18n5);
	}

}
