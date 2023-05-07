package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.HousekepingOrder;

public interface HousekepingRepository extends JpaRepository<HousekepingOrder, Long> {
	Optional<HousekepingOrder> findById(int id);
}
