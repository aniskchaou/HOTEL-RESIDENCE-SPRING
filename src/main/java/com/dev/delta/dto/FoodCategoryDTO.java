package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.FoodCategoryI18nRepository;
import com.dev.delta.services.FoodCategoryService;

@Service
public class FoodCategoryDTO implements DTO {

	@Autowired
	FoodCategoryService foodCategoryService;

	@Autowired
	FoodCategoryI18nRepository foodCategoryI18nRepository;

	@Override
	public void populate() {

		foodCategory.setName("Beverages");
		foodCategory.setStatus("Active");

		foodCategory2.setName("Breakfast");
		foodCategory2.setStatus("Active");
		foodCategoryService.save(foodCategory);
		foodCategoryService.save(foodCategory2);

		foodCategoryI18n.setNameI18n("Name");
		foodCategoryI18n.setStatusI18n("Status");
		foodCategoryI18n.setGetTitleI18n("Food category");
		foodCategoryI18n.setCreateTitleI18n("Create");
		foodCategoryI18n.setEditTitleI18n("Edit");
		foodCategoryI18n.setGetAllTitleI18n("Food categories");
		foodCategoryI18n.setLangI18n("EN");
		foodCategoryI18nRepository.save(foodCategoryI18n);

		foodCategoryI18n2.setNameI18n("Name");
		foodCategoryI18n2.setStatusI18n("Status");
		foodCategoryI18n2.setGetTitleI18n("Lebensmittelkategorie");
		foodCategoryI18n2.setCreateTitleI18n("Erstellen");
		foodCategoryI18n2.setEditTitleI18n("Bearbeiten");
		foodCategoryI18n2.setGetAllTitleI18n("Lebensmittelkategorien");
		foodCategoryI18n2.setLangI18n("DE");
		foodCategoryI18nRepository.save(foodCategoryI18n2);

		foodCategoryI18n3.setNameI18n("الاسم");
		foodCategoryI18n3.setStatusI18n("الحالة");
		foodCategoryI18n3.setGetTitleI18n("فئة الطعام");
		foodCategoryI18n3.setCreateTitleI18n("إنشاء");
		foodCategoryI18n3.setEditTitleI18n("تحرير");
		foodCategoryI18n3.setGetAllTitleI18n("فئات الطعام");
		foodCategoryI18n3.setLangI18n("AR");
		foodCategoryI18nRepository.save(foodCategoryI18n3);

		foodCategoryI18n4.setNameI18n("Nom");
		foodCategoryI18n4.setStatusI18n("Statut");
		foodCategoryI18n4.setGetTitleI18n("Catégorie d'aliments");
		foodCategoryI18n4.setCreateTitleI18n("Créer");
		foodCategoryI18n4.setEditTitleI18n("Modifier");
		foodCategoryI18n4.setGetAllTitleI18n("Catégories d'aliments");
		foodCategoryI18n4.setLangI18n("FR");
		foodCategoryI18nRepository.save(foodCategoryI18n4);

		foodCategoryI18n5.setNameI18n("Nombre");
		foodCategoryI18n5.setStatusI18n("Estado");
		foodCategoryI18n5.setGetTitleI18n("Categoría de alimentos");
		foodCategoryI18n5.setCreateTitleI18n("Crear");
		foodCategoryI18n5.setEditTitleI18n("Editar");
		foodCategoryI18n5.setGetAllTitleI18n("Categorías de alimentos");
		foodCategoryI18n5.setLangI18n("ES");
		foodCategoryI18nRepository.save(foodCategoryI18n5);

	}

}
