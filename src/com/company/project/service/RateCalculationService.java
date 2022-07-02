package com.company.project.service;

import com.company.project.model.InputData;
import com.company.project.model.Rate;

import java.util.List;

public interface RateCalculationService {

    List<Rate> calculate(final InputData inputData);

}
