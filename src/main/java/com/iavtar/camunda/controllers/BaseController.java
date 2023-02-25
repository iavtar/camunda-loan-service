package com.iavtar.camunda.controllers;

import com.iavtar.camunda.util.TransactionUtil;
import org.camunda.bpm.engine.ProcessEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class BaseController {

    @Autowired
    private ProcessEngine processEngine;

    protected String getTransactionId() {
        return TransactionUtil.getTransactionId();
    }

    protected void startProcess(String processName,
                                String transactionId,
                                Map<String, Object> processDataMap) {
        processEngine.getRuntimeService().startProcessInstanceByKey(
                processName,
                transactionId,
                processDataMap
        );
    }

}
