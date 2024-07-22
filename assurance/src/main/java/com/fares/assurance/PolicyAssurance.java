package com.fares.assurance;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PolicyAssurance {

    private String policyHolder;
    private String policyType;
    private String policyDetails;
    private String coverageDetails;
    private double amountOfAssurance;
    private Date policyStartDate;
    private Date   policyEndDate;
    private String policyStatus;
}
