package com.company.project.service;

import com.company.project.model.InputData;
import com.company.project.model.Rate;
import com.company.project.model.RateAmounts;

public interface AmountsCalculationService {
    default RateAmounts calculate(InputData inputData) {
        return null;
    }

    RateAmounts calculate(InputData inputData, Rate previousRate);
}

