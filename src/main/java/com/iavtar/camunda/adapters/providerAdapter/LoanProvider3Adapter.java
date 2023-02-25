package com.iavtar.camunda.adapters.providerAdapter;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class LoanProvider3Adapter implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        try {
            int x = 0/0;
            return;
        } catch (Exception exception) {
            throw new BpmnError("providerError", "Error occured fetching quotes from loan provider3");
        }
    }

}
