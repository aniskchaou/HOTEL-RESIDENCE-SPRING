package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.FoodI18nRepository;
import com.dev.delta.services.FoodService;

@Service
public class FoodDTO implements DTO {

	@Autowired
	FoodService foodService;

	@Autowired
	FoodI18nRepository foodI18nRepository;

	@Override
	public void populate() {

		food.setCategory(foodCategory);
		food.setPrice("18");
		food.setItemName("Pizza");
		food.setStatus("Active");
		foodService.save(food);

		foodI18n.setCategoryI18n("Category");
		foodI18n.setPriceI18n("Price");
		foodI18n.setItemNameI18n("Item name");
		foodI18n.setStatusI18n("Status");
		foodI18n.setLangI18n("EN");
		foodI18n.setGetTitleI18n("Food");
		foodI18n.setCreateTitleI18n("Create");
		foodI18n.setEditTitleI18n("Edit");
		foodI18n.setGetAllTitleI18n("Foods");

		foodI18n2.setCategoryI18n("Kategorie");
		foodI18n2.setPriceI18n("Preis");
		foodI18n2.setItemNameI18n("Artikelname");
		foodI18n2.setStatusI18n("Status");
		foodI18n2.setLangI18n("DE");
		foodI18n2.setGetTitleI18n("Lebensmittel");
		foodI18n2.setCreateTitleI18n("Erstellen");
		foodI18n2.setEditTitleI18n("Bearbeiten");
		foodI18n2.setGetAllTitleI18n("Lebensmittel");
		foodI18nRepository.save(foodI18n);

		foodI18nRepository.save(foodI18n2);

		foodI18n3.setCategoryI18n("الفئة");
		foodI18n3.setPriceI18n("السعر");
		foodI18n3.setItemNameI18n("اسم العنصر");
		foodI18n3.setStatusI18n("الحالة");
		foodI18n3.setLangI18n("AR");
		foodI18n3.setGetTitleI18n("طعام");
		foodI18n3.setCreateTitleI18n("إنشاء");
		foodI18n3.setEditTitleI18n("تحرير");
		foodI18n3.setGetAllTitleI18n("الأطعمة");
		foodI18nRepository.save(foodI18n3);

		foodI18n4.setCategoryI18n("Catégorie");
		foodI18n4.setPriceI18n("Prix");
		foodI18n4.setItemNameI18n("Nom de l'article");
		foodI18n4.setStatusI18n("Statut");
		foodI18n4.setLangI18n("FR");
		foodI18n4.setGetTitleI18n("Nourriture");
		foodI18n4.setCreateTitleI18n("Créer");
		foodI18n4.setEditTitleI18n("Modifier");
		foodI18n4.setGetAllTitleI18n("Aliments");
		foodI18nRepository.save(foodI18n4);

		foodI18n5.setCategoryI18n("Categoría");
		foodI18n5.setPriceI18n("Precio");
		foodI18n5.setItemNameI18n("Nombre del artículo");
		foodI18n5.setStatusI18n("Estado");
		foodI18n5.setLangI18n("ES");
		foodI18n5.setGetTitleI18n("Comida");
		foodI18n5.setCreateTitleI18n("Crear");
		foodI18n5.setEditTitleI18n("Editar");
		foodI18n5.setGetAllTitleI18n("Alimentos");
		foodI18nRepository.save(foodI18n5);

	}

}
