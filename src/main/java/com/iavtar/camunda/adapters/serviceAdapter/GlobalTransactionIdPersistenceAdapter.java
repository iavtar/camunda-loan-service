package com.iavtar.camunda.adapters.serviceAdapter;

import com.iavtar.camunda.entity.Transaction;
import com.iavtar.camunda.enums.State;
import com.iavtar.camunda.repositories.TransactionRepository;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GlobalTransactionIdPersistenceAdapter implements JavaDelegate {

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        boolean isEligible = Boolean.parseBoolean((String) execution
                .getVariable("isEligible"));
        String transactionId = (String) execution.getVariable("transactionId");
        if(!isEligible) {
            Transaction transaction = transactionRepository.findByTransactionId(transactionId);
            transaction.setState(State.FETCH_QUOTE_ELIGIBILITY_FAILED);
            transactionRepository.save(transaction);
        }
        return;
    }

}
