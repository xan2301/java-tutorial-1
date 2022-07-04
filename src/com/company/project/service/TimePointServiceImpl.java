package com.company.project.service;

import com.company.project.model.TimePoint;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.company.project.service.PrintingService.YEAR;

public class TimePointServiceImpl implements TimePointService {

    public static final BigDecimal YEAR = BigDecimal.valueOf(12);


    @Override
    public TimePoint calculate(){

        return new TimePoint();
    }

    private BigDecimal calculateYear(final BigDecimal rateNumber){

        return rateNumber.divide(YEAR, RoundingMode.HALF_UP);
    }

    private BigDecimal calculateMonth(final BigDecimal rateNumber){

        return rateNumber.remainder(YEAR);
    }


}
