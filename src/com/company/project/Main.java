package com.company.project;

import com.company.project.model.InputData;
import com.company.project.service.PrintingService;
import com.company.project.service.PrintingServiceImpl;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        InputData inputData = new InputData()
                .withAmount(new BigDecimal("298000"))
                .withMonthsDuration(BigDecimal.valueOf(160));


        PrintingService printingService = new PrintingServiceImpl();
        printingService.printInputDataInfo(inputData);
    }

}
