package com.iavtar.camunda.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum EmploymentSector {

    PRIVATE("private"),
    GOVERNMENT("government"),
    BUSINESS_OWNER("business_owner");

    @JsonValue
    private String value;

    EmploymentSector(String value) {
        this.value = value;
    }

}
