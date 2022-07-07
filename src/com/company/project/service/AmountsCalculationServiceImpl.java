package com.company.project.service;

import com.company.project.model.InputData;
import com.company.project.model.Rate;
import com.company.project.model.RateAmounts;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AmountsCalculationServiceImpl implements AmountsCalculationService {

    public static final BigDecimal YEAR = BigDecimal.valueOf(12);

    @Override
    public RateAmounts calculate(InputData inputData) {

        switch (inputData.getRateType()) {

            case CONSTANT:
                return calculateConstantRate(inputData);

            case DECREASING:
                return calculateDecreasingRate(inputData);

            default:
                throw new RuntimeException("Case not handled");
        }


    }


    @Override
    public RateAmounts calculate(InputData inputData, Rate previousRate) {

        switch (inputData.getRateType()) {

            case CONSTANT:
                return calculateConstantRate(inputData, previousRate);

            case DECREASING:
                return calculateDecreasingRate(inputData, previousRate);

            default:
                throw new RuntimeException("Case not handled");

        }

    }


    private RateAmounts calculateConstantRate(InputData inputData) {

        BigDecimal q = calculateQ(inputData.getInterestPercent());


        BigDecimal rateAmount = calculateConstantRateAmount();
        BigDecimal interestAmount = calculateInterestAmount();
        BigDecimal capitalAmount = calculateConstantCapitalAmount();


        return new RateAmounts(rateAmount, interestAmount, capitalAmount);
    }




    private RateAmounts calculateConstantRate(InputData inputData, Rate previousRate) {

        BigDecimal q = calculateQ(inputData.getInterestPercent());



        BigDecimal rateAmount = calculateConstantRateAmount();
        BigDecimal interestAmount = calculateInterestAmount();
        BigDecimal capitalAmount = calculateConstantCapitalAmount();


        return new RateAmounts(rateAmount, interestAmount, capitalAmount);
    }


    private BigDecimal calculateQ(BigDecimal interestPercent) {
        return interestPercent.divide(YEAR, 10, RoundingMode.HALF_UP).add(BigDecimal.ONE);
    }


    private RateAmounts calculateDecreasingRate(InputData inputData) {



        return new RateAmounts();


    }

    private RateAmounts calculateDecreasingRate(InputData inputData, Rate previousRate) {
        return new RateAmounts();
    }


}
