package com.fares.assurancePolicy;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class AssurancePolicy {
    @Id
    @GeneratedValue
    private Integer id;
    private String policyHolder;
    private String policyType;
    private String policyDetails;
    private String coverageDetails;
    private double amountOfAssurance;
    private Date   policyStartDate;
    private Date   policyEndDate;
    private String policyStatus;
    private Integer assuranceId;



}
