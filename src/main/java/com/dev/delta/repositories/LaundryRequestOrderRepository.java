package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.LaundryRequestOrder;

public interface LaundryRequestOrderRepository extends JpaRepository<LaundryRequestOrder, Long> {

}
