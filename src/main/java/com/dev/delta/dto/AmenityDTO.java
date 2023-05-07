package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.AmenityI18nRepository;
import com.dev.delta.repositories.AmenityRepository;

@Service
public class AmenityDTO implements DTO {

	@Autowired
	AmenityRepository amenityRepository;

	@Autowired
	AmenityI18nRepository amenityI18nRepository;

	@Override
	public void populate() {

		amenityI18n.setLanguageI18n("DE");
		amenityI18n.setDescriptionI18n("Beschreibung");
		amenityI18n.setNameI18n("Namen");
		amenityI18n.setStatusI18n("Stellung");
		amenityI18n.setGetTitleI18n("Ausstattung");
		amenityI18n.setCreateTitleI18n("Erstellen");
		amenityI18n.setEditTitleI18n("Bearbeiten");
		amenityI18n.setGetAllTitleI18n("Ausstattung");

		amenityI18n2.setLanguageI18n("EN");
		amenityI18n2.setDescriptionI18n("Description");
		amenityI18n2.setNameI18n("Name");
		amenityI18n2.setStatusI18n("Status");
		amenityI18n2.setGetTitleI18n("Amenity");
		amenityI18n2.setCreateTitleI18n("Create");
		amenityI18n2.setEditTitleI18n("Edit");
		amenityI18n2.setGetAllTitleI18n("Amenities");

		amenityI18n5.setLanguageI18n("ES");
		amenityI18n5.setDescriptionI18n("Descripción");
		amenityI18n5.setNameI18n("Nombre");
		amenityI18n5.setStatusI18n("Estado");
		amenityI18n5.setGetTitleI18n("Amenidad");
		amenityI18n5.setCreateTitleI18n("Crear");
		amenityI18n5.setEditTitleI18n("Editar");
		amenityI18n5.setGetAllTitleI18n("Amenidades");

		amenityI18n3.setLanguageI18n("FR");
		amenityI18n3.setDescriptionI18n("Description");
		amenityI18n3.setNameI18n("Nom");
		amenityI18n3.setStatusI18n("Statut");
		amenityI18n3.setGetTitleI18n("Aménité");
		amenityI18n3.setCreateTitleI18n("Créer");
		amenityI18n3.setEditTitleI18n("Editer");
		amenityI18n3.setGetAllTitleI18n("Aménités");

		amenityI18n4.setLanguageI18n("AR");
		amenityI18n4.setDescriptionI18n("وصف");
		amenityI18n4.setNameI18n("اسم");
		amenityI18n4.setStatusI18n("حالة");
		amenityI18n4.setGetTitleI18n("الراحة");
		amenityI18n4.setCreateTitleI18n("إنشاء");
		amenityI18n4.setEditTitleI18n("تعديل");
		amenityI18n4.setGetAllTitleI18n("وسائل الراحة");

		amenityI18nRepository.save(amenityI18n);
		amenityI18nRepository.save(amenityI18n2);
		amenityI18nRepository.save(amenityI18n4);
		amenityI18nRepository.save(amenityI18n3);
		amenityI18nRepository.save(amenityI18n5);

		amenity.setDescription("Suspendisse sem ex, mattis ut luctus ac, bibendum in metus");
		amenity.setName("Tea/Coffee Maker");
		amenity.setStatus("Active");

		amenity1.setDescription("Suspendisse sem ex, mattis ut luctus ac, bibendum in metus");
		amenity1.setName("LCD");
		amenity1.setStatus("Active");

		amenity2.setDescription("Suspendisse sem ex, mattis ut luctus ac, bibendum in metus");
		amenity2.setName("Parking");
		amenity2.setStatus("Active");

		amenity3.setDescription("Suspendisse sem ex, mattis ut luctus ac, bibendum in metus");
		amenity3.setName("Wifi");
		amenity3.setStatus("Active");

		amenity4.setDescription("Suspendisse sem ex, mattis ut luctus ac, bibendum in metus");
		amenity4.setName("Fitness Centre");
		amenity4.setStatus("Active");

		amenityRepository.save(amenity);
		amenityRepository.save(amenity1);
		amenityRepository.save(amenity2);
		amenityRepository.save(amenity3);
		amenityRepository.save(amenity4);

	}

}
