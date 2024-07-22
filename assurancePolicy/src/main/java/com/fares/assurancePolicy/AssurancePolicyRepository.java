package com.fares.assurancePolicy;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssurancePolicyRepository extends JpaRepository<AssurancePolicy, Integer>{


     List<AssurancePolicy> findAllByAssuranceId(Integer idAssurance);
}
