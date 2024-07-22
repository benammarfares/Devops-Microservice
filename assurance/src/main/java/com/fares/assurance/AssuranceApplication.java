package com.fares.assurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class AssuranceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssuranceApplication.class, args);
	}

}
