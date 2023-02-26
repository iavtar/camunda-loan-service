package com.iavtar.camunda.enums;

import lombok.Getter;

@Getter
public enum BpmnErrorCode {

    PROVIDER_ERROR("providerError"),
    PERSISTENCE_ERROR("persistenceError");

    private String value;

    BpmnErrorCode(String value){
        this.value = value;
    }

}
