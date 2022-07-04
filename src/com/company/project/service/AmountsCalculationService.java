package com.company.project.service;

import com.company.project.model.RateAmounts;

public interface AmountsCalculationService {
    default RateAmounts calculate() {
        return null;
    }
}
