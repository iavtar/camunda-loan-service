package com.iavtar.camunda.enums;

import lombok.Getter;

@Getter
public enum State {

    START("start"),
    FETCH_QUOTE_STARTED("fetch_quotes_started"),
    FETCH_QUOTE_FAILED("fetch_quotes_failed"),
    FETCH_QUOTE_ELIGIBILITY_FAILED("fetch_quotes_eligibility_failed"),
    NOT_ELIGIBLE("not_eligible"),
    END("end"),
    FAILED("failed");

    private String value;

    State(String value) {
        this.value = value;
    }

}
