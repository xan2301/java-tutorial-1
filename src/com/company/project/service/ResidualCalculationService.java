package com.company.project.service;

import com.company.project.model.InputData;
import com.company.project.model.MortgageResidual;
import com.company.project.model.Rate;
import com.company.project.model.RateAmounts;

public interface ResidualCalculationService {
    MortgageResidual calculate(RateAmounts rateAmounts, InputData inputData);




    MortgageResidual calculate(RateAmounts rateAmounts, Rate previousRate);



}
