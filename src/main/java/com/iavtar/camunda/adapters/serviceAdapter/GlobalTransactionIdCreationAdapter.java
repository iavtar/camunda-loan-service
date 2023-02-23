package com.iavtar.camunda.adapters.serviceAdapter;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class GlobalTransactionIdCreationAdapter implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        return;
    }

}
