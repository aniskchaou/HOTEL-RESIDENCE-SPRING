package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.HouseKeepingOrderI18nRepository;

@Service
public class HouseKeepingOrderDTO implements DTO {

	@Autowired
	HouseKeepingOrderI18nRepository houseKeepingOrderI18nRepository;

	@Override
	public void populate() {
		// TODO Auto-generated method stub
		houseKeepingOrderI18n.setAssignedToI18n("Assigned");
		houseKeepingOrderI18n.setHousekeepingItemI18n("Item");
		houseKeepingOrderI18n.setHousekeepingStatusI18n("Status");
		houseKeepingOrderI18n.setRemarkI18n("Remark");
		houseKeepingOrderI18n.setRoomI18n("Room");
		houseKeepingOrderI18n.setLangI18n("EN");
		houseKeepingOrderI18n.setCreateTitleI18n("Create");
		houseKeepingOrderI18n.setEditTitleI18n("Edit");
		houseKeepingOrderI18n.setGetAllTitleI18n("HouseKeeping Orders");
		houseKeepingOrderI18n.setGetTitleI18n("HouseKeeping Order");
		houseKeepingOrderI18nRepository.save(houseKeepingOrderI18n);

		houseKeepingOrderI18n2.setAssignedToI18n("Zugewiesen an");
		houseKeepingOrderI18n2.setHousekeepingItemI18n("Artikel");
		houseKeepingOrderI18n2.setHousekeepingStatusI18n("Status");
		houseKeepingOrderI18n2.setRemarkI18n("Bemerkung");
		houseKeepingOrderI18n2.setRoomI18n("Zimmer");
		houseKeepingOrderI18n2.setLangI18n("DE");
		houseKeepingOrderI18n2.setCreateTitleI18n("Erstellen");
		houseKeepingOrderI18n2.setEditTitleI18n("Bearbeiten");
		houseKeepingOrderI18n2.setGetAllTitleI18n("HouseKeeping Bestellungen");
		houseKeepingOrderI18n2.setGetTitleI18n("HouseKeeping Ordnung");
		houseKeepingOrderI18nRepository.save(houseKeepingOrderI18n2);

		houseKeepingOrderI18n3.setAssignedToI18n("Assigned");
		houseKeepingOrderI18n3.setHousekeepingItemI18n("العنصر");
		houseKeepingOrderI18n3.setHousekeepingStatusI18n("الحالة");
		houseKeepingOrderI18n3.setRemarkI18n("ملاحظة");
		houseKeepingOrderI18n3.setRoomI18n("الغرفة");
		houseKeepingOrderI18n3.setLangI18n("AR");
		houseKeepingOrderI18n3.setCreateTitleI18n("إنشاء");
		houseKeepingOrderI18n3.setEditTitleI18n("تحرير");
		houseKeepingOrderI18n3.setGetAllTitleI18n("أوامر حفظ المنزل");
		houseKeepingOrderI18n3.setGetTitleI18n("ترتيب حفظ المنزل");
		houseKeepingOrderI18nRepository.save(houseKeepingOrderI18n3);

		houseKeepingOrderI18n4.setAssignedToI18n("Attribué");
		houseKeepingOrderI18n4.setHousekeepingItemI18n("Item");
		houseKeepingOrderI18n4.setHousekeepingStatusI18n("Statut");
		houseKeepingOrderI18n4.setRemarkI18n("Remarque");
		houseKeepingOrderI18n4.setRoomI18n("Chambre");
		houseKeepingOrderI18n4.setLangI18n("FR");
		houseKeepingOrderI18n4.setCreateTitleI18n("Créer");
		houseKeepingOrderI18n4.setEditTitleI18n("Modifier");
		houseKeepingOrderI18n4.setGetAllTitleI18n("HouseKeeping Orders");
		houseKeepingOrderI18n4.setGetTitleI18n("HouseKeeping Order");
		houseKeepingOrderI18nRepository.save(houseKeepingOrderI18n4);

		houseKeepingOrderI18n5.setAssignedToI18n("Asignado");
		houseKeepingOrderI18n5.setHousekeepingItemI18n("Elemento");
		houseKeepingOrderI18n5.setHousekeepingStatusI18n("Estado");
		houseKeepingOrderI18n5.setRemarkI18n("Observación");
		houseKeepingOrderI18n5.setRoomI18n("Habitación");
		houseKeepingOrderI18n5.setLangI18n("ES");
		houseKeepingOrderI18n5.setCreateTitleI18n("Crear");
		houseKeepingOrderI18n5.setEditTitleI18n("Editar");
		houseKeepingOrderI18n5.setGetAllTitleI18n("Órdenes de mantenimiento de la casa");
		houseKeepingOrderI18n5.setGetTitleI18n("Orden de mantenimiento de la casa");
		houseKeepingOrderI18nRepository.save(houseKeepingOrderI18n5);

	}

}
