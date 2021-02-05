package com.centene.enrolleestatustrackerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.centene.controller", "com.centene.service"})
@EntityScan("com.centene.model")
@EnableJpaRepositories("com.centene.repository")
public class EnrolleeStatusTrackerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnrolleeStatusTrackerServiceApplication.class, args);
	}

}
