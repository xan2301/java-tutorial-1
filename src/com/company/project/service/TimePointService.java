package com.company.project.service;

import com.company.project.model.InputData;
import com.company.project.model.TimePoint;

import java.math.BigDecimal;

public interface TimePointService {


    TimePoint calculate(BigDecimal rateNumber, InputData inputData);
}
