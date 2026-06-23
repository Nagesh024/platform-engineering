package com.rapido.platformengineering.technicaldebt.service;

import com.rapido.platformengineering.technicaldebt.entity.TechnicalDebt;

import com.rapido.platformengineering.technicaldebt.dto.TechnicalDebtDashboardResponse;
import com.rapido.platformengineering.technicaldebt.enums.DebtCategory;
import com.rapido.platformengineering.technicaldebt.enums.DebtStatus;
import com.rapido.platformengineering.technicaldebt.repository.TechnicalDebtRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnicalDebtService {

    private final TechnicalDebtRepository repository;

    public TechnicalDebtService(
            TechnicalDebtRepository repository) {
        this.repository = repository;
    }

    public TechnicalDebt save(TechnicalDebt debt) {
        return repository.save(debt);
    }

    public List<TechnicalDebt> findAll() {
        return repository.findAll();
    }
    public TechnicalDebtDashboardResponse getDashboard() {

        TechnicalDebtDashboardResponse response =
                new TechnicalDebtDashboardResponse();

        response.setTotalDebts(repository.count());

        response.setOpenDebts(
                repository.countByStatus(DebtStatus.OPEN));

        response.setResolvedDebts(
                repository.countByStatus(DebtStatus.RESOLVED));

        response.setArchitectureDebts(
                repository.countByCategory(DebtCategory.ARCHITECTURE));

        response.setSecurityDebts(
                repository.countByCategory(DebtCategory.SECURITY));

        response.setPerformanceDebts(
                repository.countByCategory(DebtCategory.PERFORMANCE));

        response.setInfrastructureDebts(
                repository.countByCategory(DebtCategory.INFRASTRUCTURE));

        response.setCodeQualityDebts(
                repository.countByCategory(DebtCategory.CODE_QUALITY));

        response.setDocumentationDebts(
                repository.countByCategory(DebtCategory.DOCUMENTATION));

        long totalRisk =
                repository.findAll()
                        .stream()
                        .mapToLong(
                                debt -> debt.getRiskScore() == null
                                        ? 0
                                        : debt.getRiskScore())
                        .sum();

        response.setTotalRiskScore(totalRisk);

        return response;
    }
}