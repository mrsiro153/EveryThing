package jooqDemo.test;

import java.math.BigInteger;

/**
 * Copyright by Intelin.
 * Creator: Nguyen Huy Doan
 * Date: 22/11/2018
 * Time: 9:21 AM
 */
public class FeeData {
    private String accountNumber;
    private BigInteger feeCITAD;
    private BigInteger feeNAPAS;
    private BigInteger taxCITAD;
    private BigInteger taxNAPAS;
    private Boolean isDefault;

    public String getAccountNumber() {
        return accountNumber;
    }

    public FeeData setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public BigInteger getFeeCITAD() {
        return feeCITAD;
    }

    public FeeData setFeeCITAD(BigInteger feeCITAD) {
        this.feeCITAD = feeCITAD;
        return this;
    }

    public BigInteger getFeeNAPAS() {
        return feeNAPAS;
    }

    public FeeData setFeeNAPAS(BigInteger feeNAPAS) {
        this.feeNAPAS = feeNAPAS;
        return this;
    }

    public BigInteger getTaxCITAD() {
        return taxCITAD;
    }

    public FeeData setTaxCITAD(BigInteger taxCITAD) {
        this.taxCITAD = taxCITAD;
        return this;
    }

    public BigInteger getTaxNAPAS() {
        return taxNAPAS;
    }

    public FeeData setTaxNAPAS(BigInteger taxNAPAS) {
        this.taxNAPAS = taxNAPAS;
        return this;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public FeeData setDefault(Boolean aDefault) {
        isDefault = aDefault;
        return this;
    }
}
