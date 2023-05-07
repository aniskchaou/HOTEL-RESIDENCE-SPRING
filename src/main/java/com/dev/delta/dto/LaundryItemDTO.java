package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.LaundryItemI18nRepository;
import com.dev.delta.repositories.LaundryItemRepository;

@Service
public class LaundryItemDTO implements DTO {

	@Autowired
	LaundryItemRepository laundryItemRepository;

	@Autowired
	LaundryItemI18nRepository laundryItemI18nRepository;

	@Override
	public void populate() {
		// TODO Auto-generated method stub
		laundryItem.setComment("czeze");
		laundryItem.setName("Tshirt");
		laundryItem.setQuantity("2");

		laundryItemI18n.setComment("Comment");
		laundryItemI18n.setCreateTitleI18n("Create");
		laundryItemI18n.setEditTitleI18n("Edit");
		laundryItemI18n.setGetAllTitleI18n("Laundry items");
		laundryItemI18n.setGetTitleI18n("Laundry item");
		laundryItemI18n.setLangI18n("EN");
		laundryItemI18n.setName("Name");
		laundryItemI18n.setQuantity("2");

		laundryItemI18n2.setComment("Kommentar");
		laundryItemI18n2.setCreateTitleI18n("Erstellen");
		laundryItemI18n2.setEditTitleI18n("Bearbeiten");
		laundryItemI18n2.setGetAllTitleI18n("Wäscheartikel");
		laundryItemI18n2.setGetTitleI18n("Wäscheartikel");
		laundryItemI18n2.setLangI18n("DE");
		laundryItemI18n2.setName("Name");
		laundryItemI18n2.setQuantity("2");

		laundryItemI18n3.setComment("Comentario");
		laundryItemI18n3.setCreateTitleI18n("Crear");
		laundryItemI18n3.setEditTitleI18n("Editar");
		laundryItemI18n3.setGetAllTitleI18n("Artículos de lavandería");
		laundryItemI18n3.setGetTitleI18n("Artículo de lavandería");
		laundryItemI18n3.setLangI18n("ES");
		laundryItemI18n3.setName("Nombre");
		laundryItemI18n3.setQuantity("2");

		laundryItemI18n4.setComment("Commentaire");
		laundryItemI18n4.setCreateTitleI18n("Créer");
		laundryItemI18n4.setEditTitleI18n("Modifier");
		laundryItemI18n4.setGetAllTitleI18n("Articles de blanchisserie");
		laundryItemI18n4.setGetTitleI18n("Article de blanchisserie");
		laundryItemI18n4.setLangI18n("FR");
		laundryItemI18n4.setName("Nom");
		laundryItemI18n4.setQuantity("2");

		laundryItemI18n5.setComment("تعليق");
		laundryItemI18n5.setCreateTitleI18n("إنشاء");
		laundryItemI18n5.setEditTitleI18n("تحرير");
		laundryItemI18n5.setGetAllTitleI18n("أدوات الغسيل");
		laundryItemI18n5.setGetTitleI18n("عنصر الغسيل");
		laundryItemI18n5.setLangI18n("AR");
		laundryItemI18n5.setName("الاسم");
		laundryItemI18n5.setQuantity("2");

		laundryItemRepository.save(laundryItem);
		laundryItemI18nRepository.save(laundryItemI18n);
		laundryItemI18nRepository.save(laundryItemI18n2);
		laundryItemI18nRepository.save(laundryItemI18n3);
		laundryItemI18nRepository.save(laundryItemI18n4);
		laundryItemI18nRepository.save(laundryItemI18n5);

	}

}
