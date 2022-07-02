package com.company.project.service;

import com.company.project.model.InputData;
import com.company.project.model.Rate;

import java.util.List;

public class MortgageCalculationServiceImpl implements MortgageCalculationService {

    private final PrintingService printingService;

    private final RateCalculationService rateCalculaionService;

    public MortgageCalculationServiceImpl(
            PrintingService printingService,
            RateCalculationService rateCalculaionService
    ) {
        this.printingService = printingService;
        this.rateCalculaionService = rateCalculaionService;
    }

    @Override
    public void calculate(InputData inputData) {

        printingService.printInputDataInfo(inputData);

        List<Rate> calculate = rateCalculaionService.calculate(inputData);


    }

}
