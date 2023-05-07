package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.FoodRequestOrder;

public interface FoodOrderRequestRepository extends JpaRepository<FoodRequestOrder, Long> {

}
