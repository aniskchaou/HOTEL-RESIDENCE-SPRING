package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.FoodOrderI18nRepository;
import com.dev.delta.repositories.FoodOrderRespository;

@Service
public class FoodOrderDTO implements DTO {

	@Autowired
	FoodOrderI18nRepository foodI18nRepository;

	@Autowired
	FoodOrderRespository foodOrderRespository;

	@Override
	public void populate() {

		foodOrder.setCheckin(checkIn);
		foodOrder.setFoodItem("Pizza");
		foodOrder.setNoofPersons("1");
		foodOrder.setPrice("33");
		foodOrder.setRoom(room);
		foodOrder.setWaiterName("John Doe");

		foodOrderRespository.save(foodOrder);

		foodOrderI18n.setCheckinI18n("Check in");
		foodOrderI18n.setFoodItemI18n("Food Item");
		foodOrderI18n.setLangI18n("EN");
		foodOrderI18n.setNoofPersonsI18n("Persons");
		foodOrderI18n.setPriceI18n("Price");
		foodOrderI18n.setRoomI18n("Room");
		foodOrderI18n.setWaiterNameI18n("Waiter");
		foodOrderI18n.setGetAllTitleI18n("Food Orders");
		foodOrderI18n.setGetTitleI18n("Food Order");
		foodOrderI18n.setEditTitleI18n("Edit");
		foodOrderI18n.setCreateTitleI18n("Create");
		foodI18nRepository.save(foodOrderI18n);

		foodOrderI18n2.setCheckinI18n("Check-In");
		foodOrderI18n2.setFoodItemI18n("Lebensmittel");
		foodOrderI18n2.setLangI18n("DE");
		foodOrderI18n2.setNoofPersonsI18n("Personen");
		foodOrderI18n2.setPriceI18n("Preis");
		foodOrderI18n2.setRoomI18n("Zimmer");
		foodOrderI18n2.setWaiterNameI18n("Kellner");
		foodOrderI18n2.setGetAllTitleI18n("Essensbestellungen");
		foodOrderI18n2.setGetTitleI18n("Essensbestellung");
		foodOrderI18n2.setEditTitleI18n("Bearbeiten");
		foodOrderI18n2.setCreateTitleI18n("Erstellen");
		foodI18nRepository.save(foodOrderI18n2);

		foodOrderI18n3.setCheckinI18n("تسجيل الوصول");
		foodOrderI18n.setFoodItemI18n("Food Item");
		foodOrderI18n3.setLangI18n("AR");
		foodOrderI18n3.setNoofPersonsI18n("الأشخاص");
		foodOrderI18n3.setPriceI18n("السعر");
		foodOrderI18n3.setRoomI18n("الغرفة");
		foodOrderI18n3.setWaiterNameI18n("النادل");
		foodOrderI18n3.setGetAllTitleI18n("طلبات الطعام");
		foodOrderI18n3.setGetTitleI18n("طلب الطعام");
		foodOrderI18n3.setEditTitleI18n("تحرير");
		foodOrderI18n3.setCreateTitleI18n("إنشاء");
		foodI18nRepository.save(foodOrderI18n3);

		foodOrderI18n4.setCheckinI18n("Enregistrement");
		foodOrderI18n4.setFoodItemI18n("Article alimentaire");
		foodOrderI18n4.setLangI18n("FR");
		foodOrderI18n4.setNoofPersonsI18n("Personnes");
		foodOrderI18n4.setPriceI18n("Prix");
		foodOrderI18n4.setRoomI18n("Chambre");
		foodOrderI18n4.setWaiterNameI18n("Serveur");
		foodOrderI18n4.setGetAllTitleI18n("Commandes de nourriture");
		foodOrderI18n4.setGetTitleI18n("Commande de nourriture");
		foodOrderI18n4.setEditTitleI18n("Modifier");
		foodOrderI18n4.setCreateTitleI18n("Créer");
		foodI18nRepository.save(foodOrderI18n4);

		foodOrderI18n5.setCheckinI18n("Registrar");
		foodOrderI18n5.setFoodItemI18n("Elemento de comida");
		foodOrderI18n5.setLangI18n("ES");
		foodOrderI18n5.setNoofPersonsI18n("Personas");
		foodOrderI18n5.setPriceI18n("Precio");
		foodOrderI18n5.setRoomI18n("Habitación");
		foodOrderI18n5.setWaiterNameI18n("Camarero");
		foodOrderI18n5.setGetAllTitleI18n("Pedidos de comida");
		foodOrderI18n5.setGetTitleI18n("Pedido de comida");
		foodOrderI18n5.setEditTitleI18n("Editar");
		foodOrderI18n5.setCreateTitleI18n("Crear");
		foodI18nRepository.save(foodOrderI18n5);

	}

}
