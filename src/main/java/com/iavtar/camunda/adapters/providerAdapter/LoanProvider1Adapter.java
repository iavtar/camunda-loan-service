package com.iavtar.camunda.adapters.providerAdapter;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class LoanProvider1Adapter implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        try {
            return;
        } catch (Exception exception) {
            throw new BpmnError("providerError", "Error occured fetching quotes from loan provider1");
        }
    }

}
