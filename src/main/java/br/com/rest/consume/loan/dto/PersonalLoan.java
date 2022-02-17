package br.com.rest.consume.loan.dto;

import java.util.List;

public class PersonalLoan {
    public String type;
    public Fees fees;
    public List<InterestRate> interestRates;
    public List<String> requiredWarranties;
    public String termsConditions;
}
