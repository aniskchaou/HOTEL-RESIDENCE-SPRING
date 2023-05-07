package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.HouseKeepingRequestOrder;

public interface HouseKeepingRequestRepository extends JpaRepository<HouseKeepingRequestOrder, Long> {

}
