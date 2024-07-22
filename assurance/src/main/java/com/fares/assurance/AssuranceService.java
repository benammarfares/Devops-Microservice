package com.fares.assurance;


import com.fares.assurance.client.AssuranceClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AssuranceService {

    private final AssuranceRepository assuranceRepository;
    private final AssuranceClient client;

    public void save(AssuranceClaim assuranceClaim) {
        assuranceRepository.save(assuranceClaim);
    }
     public List<AssuranceClaim> getAll()
     {
            return assuranceRepository.findAll();
     }

     public AssuranceResponse getAssuranceById(Integer id) {
         var assuranceClaim = assuranceRepository.findById(id).orElse(AssuranceClaim.builder()
                 .claimName("NOT_FOUND")
                 .claimDate(null)
                 .claimDescription("No description available")
                 .claimAmount(0.0)
                 .claimStatus("Unknown")
                 .claimProcessedDate(null)
                 .claimPayoutAmount(0.0)
                 .build());

        var policyRelatedToAssurance = client.findAllPolicyByAssurance(id) ;
        return  AssuranceResponse.builder()
                .claimName(assuranceClaim.getClaimName())
                .claimDate(assuranceClaim.getClaimDate())
                .claimDescription(assuranceClaim.getClaimDescription())
                .claimAmount(assuranceClaim.getClaimAmount())
                .claimStatus(assuranceClaim.getClaimStatus())
                .claimProcessedDate(assuranceClaim.getClaimProcessedDate())
                .claimPayoutAmount(assuranceClaim.getClaimPayoutAmount())
                .policyAssurance(policyRelatedToAssurance)
                .build() ;
     }

}
