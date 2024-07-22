package com.fares.assurance;

import lombok.*;

import java.util.Date;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class AssuranceResponse {

    private String claimName;
    private Date claimDate;
    private String claimDescription;
    private double claimAmount;
    private String claimStatus;
    private Date claimProcessedDate;
    private double claimPayoutAmount;


    List<PolicyAssurance> policyAssurance;
}
