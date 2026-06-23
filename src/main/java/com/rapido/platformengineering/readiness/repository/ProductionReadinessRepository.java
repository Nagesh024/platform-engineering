package com.rapido.platformengineering.readiness.repository;

import com.rapido.platformengineering.readiness.entity.ProductionReadinessAssessment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductionReadinessRepository
        extends JpaRepository<ProductionReadinessAssessment, Long> {
}