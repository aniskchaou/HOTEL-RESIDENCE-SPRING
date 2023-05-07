package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Bed;

public interface BedRepository extends JpaRepository<Bed, Long> {

}
