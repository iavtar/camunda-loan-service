package com.iavtar.camunda.model.request;

import com.iavtar.camunda.enums.EmploymentSector;
import com.iavtar.camunda.enums.Gender;
import lombok.Data;
import lombok.Getter;

@Data
public class LoanQuoteRequest {

    private int age;

    private Long annualIncome;

    private EmploymentSector employmentSector;

    private Gender gender;

}
