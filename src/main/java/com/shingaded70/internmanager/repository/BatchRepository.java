package com.shingaded70.internmanager.repository;

import com.shingaded70.internmanager.model.Batch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BatchRepository extends JpaRepository<Batch, Long> {
}