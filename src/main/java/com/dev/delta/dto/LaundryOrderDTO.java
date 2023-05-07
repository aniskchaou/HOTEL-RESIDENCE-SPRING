package com.dev.delta.dto;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.LaundryOrderI18nRepository;
import com.dev.delta.repositories.LaundryOrderRepository;

@Service
public class LaundryOrderDTO implements DTO {

	@Autowired
	LaundryOrderI18nRepository laundryOrderI18nRepository;

	@Autowired
	LaundryOrderRepository laundryOrderRepository;

	@Override
	public void populate() {
		laundryOrder.setDate(new Date().toString());

		laundryOrder.setLaundryitem("T shirt");
		laundryOrder.setRoom(room);

		laundryOrderRepository.save(laundryOrder);

		laundryOrderI18n.setDateI18n("Date");
		laundryOrderI18n.setLangI18n("EN");
		laundryOrderI18n.setLaundryitemI18n("Laundry Item");
		laundryOrderI18n.setRoomI18n("Room");
		laundryOrderI18n.setCreateTitleI18n("Create");
		laundryOrderI18n.setEditTitleI18n("Edit");
		laundryOrderI18n.setGetAllTitleI18n("Laundry Orders");
		laundryOrderI18n.setGetTitleI18n("Laundry Order");
		laundryOrderI18nRepository.save(laundryOrderI18n);

		laundryOrderI18n2.setDateI18n("Datum");
		laundryOrderI18n2.setLangI18n("DE");
		laundryOrderI18n2.setLaundryitemI18n("Wäscheartikel");
		laundryOrderI18n2.setRoomI18n("Zimmer");
		laundryOrderI18n2.setCreateTitleI18n("Erstellen");
		laundryOrderI18n2.setEditTitleI18n("Bearbeiten");
		laundryOrderI18n2.setGetAllTitleI18n("Wäschebestellungen");
		laundryOrderI18n2.setGetTitleI18n("Wäschebestellung");
		laundryOrderI18nRepository.save(laundryOrderI18n2);

		laundryOrderI18n4.setDateI18n("Fecha");
		laundryOrderI18n4.setLangI18n("ES");
		laundryOrderI18n4.setLaundryitemI18n("Artículo de lavandería");
		laundryOrderI18n4.setRoomI18n("Habitación");
		laundryOrderI18n4.setCreateTitleI18n("Crear");
		laundryOrderI18n4.setEditTitleI18n("Editar");
		laundryOrderI18n4.setGetAllTitleI18n("Pedidos de lavandería");
		laundryOrderI18n4.setGetTitleI18n("Pedido de lavandería");
		laundryOrderI18nRepository.save(laundryOrderI18n4);

		laundryOrderI18n3.setDateI18n("Date");
		laundryOrderI18n3.setLangI18n("FR");
		laundryOrderI18n3.setLaundryitemI18n("Article de blanchisserie");
		laundryOrderI18n3.setRoomI18n("Chambre");
		laundryOrderI18n3.setCreateTitleI18n("Créer");
		laundryOrderI18n3.setEditTitleI18n("Modifier");
		laundryOrderI18n3.setGetAllTitleI18n("Commandes de blanchisserie");
		laundryOrderI18n3.setGetTitleI18n("Commande de blanchisserie");
		laundryOrderI18nRepository.save(laundryOrderI18n3);

		laundryOrderI18n5.setDateI18n("التاريخ");
		laundryOrderI18n5.setLangI18n("AR");
		laundryOrderI18n5.setLaundryitemI18n("عنصر الغسيل");
		laundryOrderI18n5.setRoomI18n("الغرفة");
		laundryOrderI18n5.setCreateTitleI18n("إنشاء");
		laundryOrderI18n5.setEditTitleI18n("تحرير");
		laundryOrderI18n5.setGetAllTitleI18n("أوامر الغسيل");
		laundryOrderI18n5.setGetTitleI18n("طلب الغسيل");
		laundryOrderI18nRepository.save(laundryOrderI18n5);

	}

}
