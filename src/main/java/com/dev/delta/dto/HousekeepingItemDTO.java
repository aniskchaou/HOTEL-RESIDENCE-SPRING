package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.HouseKeepingItemI18nRepository;

@Service
public class HousekeepingItemDTO implements DTO {

	@Autowired
	HouseKeepingItemI18nRepository houseKeepingItemI18nRepository;

	@Override
	public void populate() {
		// TODO Auto-generated method stub
		houseKeepingItemI18n.setNameI18n("Name");
		houseKeepingItemI18n.setGetAllTitleI18n("HouseKeeping Items");
		houseKeepingItemI18n.setCreateTitleI18n("Create");
		houseKeepingItemI18n.setEditTitleI18n("Edit");
		houseKeepingItemI18n.setGetTitleI18n("HouseKeeping");
		houseKeepingItemI18n.setLangI18n("EN");
		houseKeepingItemI18nRepository.save(houseKeepingItemI18n);

		houseKeepingItemI18n2.setNameI18n("Name");
		houseKeepingItemI18n2.setGetAllTitleI18n("Hauswirtschaften");
		houseKeepingItemI18n2.setCreateTitleI18n("Erstellen");
		houseKeepingItemI18n2.setEditTitleI18n("Bearbeiten");
		houseKeepingItemI18n2.setGetTitleI18n("Hauswirtschaft");
		houseKeepingItemI18n2.setLangI18n("DE");
		houseKeepingItemI18nRepository.save(houseKeepingItemI18n2);

		houseKeepingItemI18n3.setNameI18n("Nombre");
		houseKeepingItemI18n3.setGetAllTitleI18n("Elementos de mantenimiento de la casa");
		houseKeepingItemI18n3.setCreateTitleI18n("Crear");
		houseKeepingItemI18n3.setEditTitleI18n("Editar");
		houseKeepingItemI18n3.setGetTitleI18n("Mantenimiento de la casa");
		houseKeepingItemI18n3.setLangI18n("ES");
		houseKeepingItemI18nRepository.save(houseKeepingItemI18n3);

		houseKeepingItemI18n4.setNameI18n("Nom");
		houseKeepingItemI18n4.setGetAllTitleI18n("HouseKeeping Items");
		houseKeepingItemI18n4.setCreateTitleI18n("Créer");
		houseKeepingItemI18n4.setEditTitleI18n("Modifier");
		houseKeepingItemI18n4.setGetTitleI18n("HouseKeeping");
		houseKeepingItemI18n4.setLangI18n("FR");
		houseKeepingItemI18nRepository.save(houseKeepingItemI18n4);

		houseKeepingItemI18n5.setNameI18n("الاسم");
		houseKeepingItemI18n5.setGetAllTitleI18n("HouseKeeping Items ");
		houseKeepingItemI18n5.setCreateTitleI18n("إنشاء");
		houseKeepingItemI18n5.setEditTitleI18n("تحرير");
		houseKeepingItemI18n5.setGetTitleI18n("HouseKeeping");
		houseKeepingItemI18n5.setLangI18n("AR");
		houseKeepingItemI18nRepository.save(houseKeepingItemI18n5);
	}

}
