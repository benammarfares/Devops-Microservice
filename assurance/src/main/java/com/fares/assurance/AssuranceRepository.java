package com.fares.assurance;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AssuranceRepository extends JpaRepository <AssuranceClaim,Integer> {
}
