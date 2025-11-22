package com.shingaded70.internmanager.repository;

import com.shingaded70.internmanager.model.Intern;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternRepository extends JpaRepository<Intern, Long> {
    long countByInternIdStartingWith(String prefix);
}