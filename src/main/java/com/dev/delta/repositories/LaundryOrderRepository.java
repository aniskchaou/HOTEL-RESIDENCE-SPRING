package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.LaundryOrder;

public interface LaundryOrderRepository extends JpaRepository<LaundryOrder, Long> {

}
