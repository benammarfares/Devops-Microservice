package com.fares.assurancePolicy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class AssurancePolicyApplication {

	@Autowired
	private AssurancePolicyRepository assurancePolicyRepository;
	public static void main(String[] args) {
		SpringApplication.run(AssurancePolicyApplication.class, args);
	}
	@Bean
	public CommandLineRunner loadData() {
		return (args) -> {
			AssurancePolicy policy1 = AssurancePolicy.builder()
					.policyHolder("John Doe")
					.policyType("Health")
					.policyDetails("Health insurance policy")
					.coverageDetails("Full coverage")
					.amountOfAssurance(100000)
					.policyStartDate(new Date())
					.policyEndDate(new Date(System.currentTimeMillis() + 31536000000L)) // 1 year later
					.policyStatus("Active")
					.assuranceId(1)
					.build();

			AssurancePolicy policy2 = AssurancePolicy.builder()
					.policyHolder("Jane Smith")
					.policyType("Life")
					.policyDetails("Life insurance policy")
					.coverageDetails("Full coverage")
					.amountOfAssurance(200000)
					.policyStartDate(new Date())
					.policyEndDate(new Date(System.currentTimeMillis() + 31536000000L)) // 1 year later
					.policyStatus("Active")
					.assuranceId(2)
					.build();

			assurancePolicyRepository.save(policy1);
			assurancePolicyRepository.save(policy2);
		};
	}
}
