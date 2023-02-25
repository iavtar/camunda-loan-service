package com.iavtar.camunda.model.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class LoanQuotesResponse {

    private String transactionId;

    private List<LoanQuotes> loanQuotes;

}
