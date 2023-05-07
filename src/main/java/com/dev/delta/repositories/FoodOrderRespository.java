package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.FoodOrder;

public interface FoodOrderRespository extends JpaRepository<FoodOrder, Long> {
	Optional<FoodOrder> findById(int id);
}
