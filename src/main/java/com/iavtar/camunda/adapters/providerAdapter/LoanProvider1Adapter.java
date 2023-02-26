package com.iavtar.camunda.adapters.providerAdapter;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class LoanProvider1Adapter implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        try {
            return;
        } catch (Exception exception) {
            throw new BpmnError("providerError", "Error while fetching quotes");
        }
    }

}
