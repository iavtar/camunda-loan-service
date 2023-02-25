package com.iavtar.camunda.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iavtar.camunda.enums.BpmnProcess;
import com.iavtar.camunda.model.request.LoanQuoteRequest;
import com.iavtar.camunda.model.response.ServiceResponse;
import com.iavtar.camunda.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoanController extends BaseController {

    @Autowired
    private ObjectMapper objectMapper;

    @PostMapping("/loanQuote")
    public ResponseEntity<ServiceResponse> loanQuotes(@RequestBody LoanQuoteRequest loanQuoteRequest) {
        try {
            String transactionId = TransactionUtil.getTransactionId();
            Map<String, Object> processDataMap = new HashMap<>();
            processDataMap.put("quoteRequest", objectMapper.writeValueAsString(loanQuoteRequest));
            processDataMap.put("transactionId", transactionId);
            startProcess(
                    BpmnProcess.LOAN_QUOTES.getValue(),
                    transactionId,
                    processDataMap
            );
            return new ResponseEntity<ServiceResponse>(
                    ServiceResponse.builder().message("gathering best quotes for you!")
                            .transactionId(transactionId).build(),
                    HttpStatus.OK
            );
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

}
