package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.ExtraBedI18nRepository;
import com.dev.delta.repositories.ExtraBedRepository;

@Service
public class ExtraBedDTO implements DTO {

	@Autowired
	ExtraBedRepository extraBedRepository;

	@Autowired
	ExtraBedI18nRepository extraBedI18nRepository;

	@Override
	public void populate() {
		extraBed.setBedNo("103");
		extraBed.setComment("kjkj");
		extraBed.setRoom(room);
		extraBed.setExtraBed("1");

		extraBedRepository.save(extraBed);

		extraBedI18n.setBedNoI18n("Bed No");
		extraBedI18n.setCommentI18n("Comment");
		extraBedI18n.setRoomI18n("Room");
		extraBedI18n.setExtraBedI18n("Extra Bed");
		extraBedI18n.setGetTitleI18n("City");
		extraBedI18n.setCreateTitleI18n("Create");
		extraBedI18n.setEditTitleI18n("Edit");
		extraBedI18n.setGetAllTitleI18n("Extra Beds");
		extraBedI18n.setLangI18n("EN");
		extraBedI18nRepository.save(extraBedI18n);

		extraBedI18n2.setBedNoI18n("Número de cama");
		extraBedI18n2.setCommentI18n("Comentario");
		extraBedI18n2.setRoomI18n("Habitación");
		extraBedI18n2.setExtraBedI18n("Cama adicional");
		extraBedI18n2.setGetTitleI18n("Ciudad");
		extraBedI18n2.setCreateTitleI18n("Crear");
		extraBedI18n2.setEditTitleI18n("Editar");
		extraBedI18n2.setGetAllTitleI18n("Camas adicionales");
		extraBedI18n2.setLangI18n("ES");
		extraBedI18nRepository.save(extraBedI18n2);

		extraBedI18n3.setBedNoI18n("Lit Non");
		extraBedI18n3.setCommentI18n("Commentaire");
		extraBedI18n3.setRoomI18n("Chambre");
		extraBedI18n3.setExtraBedI18n("Lit supplémentaire");
		extraBedI18n3.setGetTitleI18n("Ville");
		extraBedI18n3.setCreateTitleI18n("Créer");
		extraBedI18n3.setEditTitleI18n("Modifier");
		extraBedI18n3.setGetAllTitleI18n("Lits supplémentaires");
		extraBedI18n3.setLangI18n("FR");
		extraBedI18nRepository.save(extraBedI18n3);

		extraBedI18n4.setBedNoI18n("Bed No");
		extraBedI18n4.setCommentI18n("تعليق");
		extraBedI18n4.setRoomI18n("الغرفة");
		extraBedI18n4.setExtraBedI18n("سرير إضافي");
		extraBedI18n4.setCreateTitleI18n("إنشاء");
		extraBedI18n4.setEditTitleI18n("تحرير");
		extraBedI18n4.setGetAllTitleI18n("أسرّة إضافية");
		extraBedI18n4.setLangI18n("EN");
		extraBedI18nRepository.save(extraBedI18n4);

		extraBedI18n5.setBedNoI18n("Bett Nr");
		extraBedI18n5.setCommentI18n("Kommentar");
		extraBedI18n5.setRoomI18n("Zimmer");
		extraBedI18n5.setExtraBedI18n("Zusatzbett");
		extraBedI18n5.setGetTitleI18n("Stadt");
		extraBedI18n5.setCreateTitleI18n("Erstellen");
		extraBedI18n5.setEditTitleI18n("Bearbeiten");
		extraBedI18n5.setGetAllTitleI18n("Zusatzbetten");
		extraBedI18n5.setLangI18n("DE");
		extraBedI18nRepository.save(extraBedI18n5);

	}

}
