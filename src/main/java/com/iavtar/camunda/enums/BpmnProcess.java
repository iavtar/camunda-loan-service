package com.iavtar.camunda.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum BpmnProcess {

    LOAN_QUOTES("loan.loanScattheredQuotes");

    @JsonValue
    private String value;

    BpmnProcess(String value) {
        this.value = value;
    }

}
