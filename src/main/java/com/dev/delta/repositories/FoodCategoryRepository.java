package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.FoodCategory;

public interface FoodCategoryRepository extends JpaRepository<FoodCategory, Long> {
	Optional<FoodCategory> findById(int id);
}
