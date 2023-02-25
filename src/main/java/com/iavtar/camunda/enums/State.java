package com.iavtar.camunda.enums;

import lombok.Getter;

@Getter
public enum State {

    START("start"),
    FETCH_QUOTES_START("fetch_quotes_start"),
    END("end"),
    FAILED("failed");

    private String value;

    State(String value) {
        this.value = value;
    }

}
