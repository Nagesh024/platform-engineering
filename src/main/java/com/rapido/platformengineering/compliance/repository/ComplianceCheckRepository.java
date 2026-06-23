package com.rapido.platformengineering.compliance.repository;

import com.rapido.platformengineering.compliance.entity.ComplianceCheck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplianceCheckRepository
        extends JpaRepository<ComplianceCheck, Long> {
}