package com.iavtar.camunda.adapters.serviceAdapter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.iavtar.camunda.entity.Transaction;
import com.iavtar.camunda.enums.State;
import com.iavtar.camunda.model.request.LoanQuoteRequest;
import com.iavtar.camunda.repositories.TransactionRepository;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GlobalTransactionIdCreationAdapter implements JavaDelegate {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        LoanQuoteRequest loanQuoteRequest = objectMapper.readValue((String) execution.getVariable("quoteRequest"), LoanQuoteRequest.class);
        execution.setVariable("age", loanQuoteRequest.getAge());
        execution.setVariable("annualIncome", loanQuoteRequest.getAnnualIncome());
        execution.setVariable("employmentSector", loanQuoteRequest.getEmploymentSector().getValue());
        execution.setVariable("gender", loanQuoteRequest.getGender().getValue());
//        Thread.sleep(100000);
        transactionRepository.save(Transaction.builder()
                        .transactionId((String) execution.getVariable("transactionId"))
                        .state(State.FETCH_QUOTES_START)
                .build());
        return;
    }

}
