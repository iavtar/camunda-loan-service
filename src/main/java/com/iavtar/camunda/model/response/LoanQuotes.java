package com.iavtar.camunda.model.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LoanQuotes {

    private String companyName;

    private double interestRate;

    private String processingFees;

    private int loanTerm;

}
