package com.dev.delta.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dev.delta.entities.CheckIn;
import com.dev.delta.entities.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

	@Query(nativeQuery = true, value = "select * from invoice i where i.checkin_id = :checkin")
	List<Invoice> findByCheckIn(@Param("checkin") CheckIn checkin);
}
