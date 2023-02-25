package com.iavtar.camunda.model.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ServiceResponse {

    private String message;

    private String transactionId;

}
