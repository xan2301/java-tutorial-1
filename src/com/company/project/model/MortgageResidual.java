package com.company.project.model;

import java.math.BigDecimal;

public class MortgageResidual {

    private final BigDecimal amount;

    private final BigDecimal dustation;

    public BigDecimal getAmount() {
        return amount;
    }

    public BigDecimal getDustation() {
        return dustation;
    }

    public MortgageResidual(BigDecimal amount, BigDecimal dustation) {
        this.amount = amount;
        this.dustation = dustation;
    }
}
