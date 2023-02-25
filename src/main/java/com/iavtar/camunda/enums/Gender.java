package com.iavtar.camunda.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum Gender {

    MALE("male"),
    FEMALE("female"),
    TRANSGENDER("transgender");

    @JsonValue
    private String value;

    Gender(String value) {
        this.value = value;
    }

}
