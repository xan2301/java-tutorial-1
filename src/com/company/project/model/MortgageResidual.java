package com.company.project.model;

import java.math.BigDecimal;

public class MortgageResidual {

    private final BigDecimal amount;

    private final BigDecimal duration;


    public MortgageResidual(BigDecimal amount, BigDecimal dustation) {
        this.amount = amount;
        this.duration = dustation;

    }

    public BigDecimal getAmount() {
        return amount;
    }

    public BigDecimal getDuration() {
        return duration;
    }


    @Override
    public String toString() {
        return "MortgageResidual{" +
                "amount=" + amount +
                ", duration=" + duration +
                '}';
    }
}
