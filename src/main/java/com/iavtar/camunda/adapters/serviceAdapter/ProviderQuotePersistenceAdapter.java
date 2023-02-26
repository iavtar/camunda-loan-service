package com.iavtar.camunda.adapters.serviceAdapter;

import com.iavtar.camunda.enums.BpmnErrorCode;
import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class ProviderQuotePersistenceAdapter implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        try {
            return;
        } catch (Exception exception) {
            throw new BpmnError(BpmnErrorCode.PERSISTENCE_ERROR.getValue(), "Error while persisting provider quotes");
        }
    }

}
