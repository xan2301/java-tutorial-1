package com.company.project.service;

import com.company.project.model.InputData;

public class MortgageCalculationServiceImpl implements MortgageCalculationService {

    public MortgageCalculationServiceImpl(PrintingService printingService) {
        this.printingService = printingService;
    }

    private final PrintingService printingService;

    @Override
    public void calculate(InputData inputData) {

        printingService.printInputDataInfo(inputData);

    }
}
