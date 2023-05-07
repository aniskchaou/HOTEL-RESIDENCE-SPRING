package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.ExtraBedI18nRepository;
import com.dev.delta.repositories.ExtraBedRepository;

@Service
public class ExtraBedOrderDTO implements DTO {

	@Autowired
	ExtraBedRepository extraBedRepository;

	@Autowired
	ExtraBedI18nRepository extraBedI18nRepository;

	@Override
	public void populate() {
		// TODO Auto-generated method stub
		extraBed.setBedNo("113");
		extraBed.setComment("guku");
		extraBed.setExtraBed("2");
		extraBed.setRoom(room);
		extraBedRepository.save(extraBed);

		extraBedI18n.setCommentI18n("Comment");
		extraBedI18n.setBedNoI18n("Bed No");
		extraBedI18n.setExtraBedI18n("Extra Bed");
		extraBedI18n.setRoomI18n("Room");
		extraBedI18n.setLangI18n("EN");
		extraBedI18nRepository.save(extraBedI18n);

		extraBedI18n2.setCommentI18n("Kommentar");
		extraBedI18n2.setBedNoI18n("Bett Nr");
		extraBedI18n2.setExtraBedI18n("Extra Bett");
		extraBedI18n2.setRoomI18n("Zimmer");
		extraBedI18n2.setLangI18n("DE");
		extraBedI18nRepository.save(extraBedI18n2);

		extraBedI18n3.setCommentI18n("تعليق");
		extraBedI18n3.setBedNoI18n("رقم السرير");
		extraBedI18n3.setExtraBedI18n("سرير إضافي");
		extraBedI18n3.setRoomI18n("الغرفة");
		extraBedI18n3.setLangI18n("AR");
		extraBedI18nRepository.save(extraBedI18n3);

		extraBedI18n4.setCommentI18n("Commentaire");
		extraBedI18n4.setBedNoI18n("Lit No");
		extraBedI18n4.setExtraBedI18n("Lit supplémentaire");
		extraBedI18n4.setRoomI18n("Chambre");
		extraBedI18n4.setLangI18n("FR");
		extraBedI18nRepository.save(extraBedI18n4);

		extraBedI18n5.setCommentI18n("Comentario");
		extraBedI18n5.setBedNoI18n("Número de cama");
		extraBedI18n5.setExtraBedI18n("Cama adicional");
		extraBedI18n5.setRoomI18n("Habitación");
		extraBedI18n5.setLangI18n("ES");
		extraBedI18nRepository.save(extraBedI18n5);

	}

}
