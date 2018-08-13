package com.springboot.maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringBootEntrypoint {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootEntrypoint.class, args);
	}

}
