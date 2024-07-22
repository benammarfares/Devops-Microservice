package com.fares.assurance;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class AssuranceClaim {
    @Id
    @GeneratedValue
    private Integer id;
    private String claimName;
    private Date claimDate;
    private String claimDescription;
    private double claimAmount;
    private String claimStatus;
    private Date claimProcessedDate;
    private double claimPayoutAmount;


}
