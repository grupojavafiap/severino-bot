package br.com.rest.consume.loan.dto;

import java.util.List;

public class Company {
    public String name;
    public String cnpjNumber;
    public Object urlComplementaryList;
    public List<PersonalLoan> personalLoans;
}
