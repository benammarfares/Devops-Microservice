package com.fares.assurance.client;


import com.fares.assurance.PolicyAssurance;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="assurancePolicy-service", url="${ASSURANCE_POLICY_URL}")
public interface AssuranceClient {
    @GetMapping("/getPolicyFromAssurance/{id}")
    List<PolicyAssurance> findAllPolicyByAssurance(@PathVariable("id") Integer assuranceId);

}
