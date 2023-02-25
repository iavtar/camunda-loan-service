package com.iavtar.camunda.enums;

import lombok.Getter;

@Getter
public enum State {

    START("start"),
    END("end");

    private String value;

    State(String value) {
        this.value = value;
    }

}
