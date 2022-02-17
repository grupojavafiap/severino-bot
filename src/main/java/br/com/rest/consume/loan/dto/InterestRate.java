package br.com.rest.consume.loan.dto;

import java.util.List;

public class InterestRate {
    public String referentialRateIndexer;
    public String rate;
    public List<Application> applications;
    public String minimumRate;
    public String maximumRate;
}
