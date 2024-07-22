package com.fares.assurancePolicy;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AssurancePolicyService {
    private final AssurancePolicyRepository assurancePolicyRepository;

    public void save(AssurancePolicy assurancePolicy) {
        assurancePolicyRepository.save(assurancePolicy);
    }

    public List<AssurancePolicy> getAll() {
        return assurancePolicyRepository.findAll();
    }


    public List<AssurancePolicy> findPolicyByAssurance(Integer idAssurance) {
        return assurancePolicyRepository.findAllByAssuranceId(idAssurance);
    }
}
