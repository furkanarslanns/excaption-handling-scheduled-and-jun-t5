package com.furkanarslan.springdemoproje3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@EntityScan(basePackages = {"com.furkanarslan"})
@EnableJpaRepositories(basePackages = {"com.furkanarslan"})
@ComponentScan(basePackages = {"com.furkanarslan"})
@EnableScheduling
@SpringBootApplication
public class Springdemoproje3Application {

	public static void main(String[] args) {
		SpringApplication.run(Springdemoproje3Application.class, args);
	}

}
