package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.ExtraBed;

public interface ExtraBedRepository extends JpaRepository<ExtraBed, Long> {
	Optional<ExtraBed> findById(int id);
}
