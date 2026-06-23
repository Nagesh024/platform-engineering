package com.rapido.platformengineering.technicaldebt.repository;

import com.rapido.platformengineering.technicaldebt.entity.TechnicalDebt;
import com.rapido.platformengineering.technicaldebt.enums.DebtCategory;
import com.rapido.platformengineering.technicaldebt.enums.DebtStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnicalDebtRepository
        extends JpaRepository<TechnicalDebt, Long> {

    long countByStatus(DebtStatus status);

    long countByCategory(DebtCategory category);
}