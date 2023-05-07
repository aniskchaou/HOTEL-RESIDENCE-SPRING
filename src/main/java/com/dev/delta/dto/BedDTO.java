package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.BedI18nRepository;
import com.dev.delta.services.BedService;

@Service
public class BedDTO implements DTO {

	@Autowired
	BedService bedService;

	@Autowired
	BedI18nRepository bedI18nRepository;

	@Override
	public void populate() {
		bed.setName("102");
		bed.setStatus("Active");
		bedService.save(bed);

		bedI18n.setLangI18n("EN");
		bedI18n.setNameI18n("Bed Number");
		bedI18n.setStatusI18n("Status");
		bedI18n.setGetTitleI18n("Bed");
		bedI18n.setCreateTitleI18n("Create");
		bedI18n.setEditTitleI18n("Edit");
		bedI18n.setGetAllTitleI18n("Beds");

		bedI18nRepository.save(bedI18n);

		bedI18n2.setLangI18n("DE");
		bedI18n2.setNameI18n("Bettnummer");
		bedI18n2.setStatusI18n("Stellung");
		bedI18n2.setGetTitleI18n("Stadt");
		bedI18n2.setCreateTitleI18n("Erstellen");
		bedI18n2.setEditTitleI18n("Bearbeiten");
		bedI18n2.setGetAllTitleI18n("Betten");
		bedI18nRepository.save(bedI18n2);

		bedI18n3.setLangI18n("FR");
		bedI18n3.setNameI18n("Numéro de lit");
		bedI18n3.setStatusI18n("Statut");
		bedI18n3.setGetTitleI18n("Lit");
		bedI18n3.setCreateTitleI18n("Créer");
		bedI18n3.setEditTitleI18n("Editer");
		bedI18n3.setGetAllTitleI18n("Lits");
		bedI18nRepository.save(bedI18n3);

		bedI18n4.setLangI18n("ES");
		bedI18n4.setNameI18n("Número de cama");
		bedI18n4.setStatusI18n("Estado");
		bedI18n4.setGetTitleI18n("Cama");
		bedI18n4.setCreateTitleI18n("Crear");
		bedI18n4.setEditTitleI18n("Editar");
		bedI18n4.setGetAllTitleI18n("Camas");
		bedI18nRepository.save(bedI18n4);

		bedI18n5.setLangI18n("AR");
		bedI18n5.setNameI18n("رقم السرير");
		bedI18n5.setStatusI18n("حالة");
		bedI18n5.setGetTitleI18n("سرير");
		bedI18n5.setCreateTitleI18n("إنشاء");
		bedI18n5.setEditTitleI18n("يحرر");
		bedI18n5.setGetAllTitleI18n("سرير");
		bedI18nRepository.save(bedI18n5);

	}

}
