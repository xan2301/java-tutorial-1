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

        BigDecimal interestPercent = inputData.getInterestPercent();
        BigDecimal residualAmount = inputData.getAmount();

        BigDecimal q = calculateQ(interestPercent);

        BigDecimal rateAmount = calculateConstantRateAmount();
        BigDecimal interestAmount = calculateInterestAmount(residualAmount, interestPercent);
        BigDecimal capitalAmount = calculateConstantCapitalAmount();



        return new RateAmounts(rateAmount, interestAmount, capitalAmount);
    }




    private RateAmounts calculateConstantRate(InputData inputData, Rate previousRate) {

        BigDecimal interestPercent = inputData.getInterestPercent();
        BigDecimal residualAmount = previousRate.getMortgageResidual().getAmount();

        BigDecimal q = calculateQ(interestPercent);



        BigDecimal rateAmount = calculateConstantRateAmount();
        BigDecimal interestAmount = calculateInterestAmount(residualAmount, interestPercent);
        BigDecimal capitalAmount = calculateConstantCapitalAmount();


        return new RateAmounts(rateAmount, interestAmount, capitalAmount);
    }




    private RateAmounts calculateDecreasingRate(InputData inputData) {



        return new RateAmounts();


    }

    private RateAmounts calculateDecreasingRate(InputData inputData, Rate previousRate) {
        return new RateAmounts();
    }

    private BigDecimal calculateQ(BigDecimal interestPercent) {
        return interestPercent.divide(YEAR, 10, RoundingMode.HALF_UP).add(BigDecimal.ONE);
    }


    private BigDecimal calculateInterestAmount(BigDecimal residualAmount, BigDecimal interestPercent) {
        return residualAmount.multiply(interestPercent).divide(YEAR, 2, RoundingMode.HALF_UP);
    }





}
