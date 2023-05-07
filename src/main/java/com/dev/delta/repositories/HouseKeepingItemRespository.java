package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.HouseKeepingItem;

public interface HouseKeepingItemRespository extends JpaRepository<HouseKeepingItem, Long> {
	Optional<HouseKeepingItem> findById(int id);
}
