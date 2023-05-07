package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.LaundryItem;

public interface LaundryItemRepository extends JpaRepository<LaundryItem, Long> {

}
