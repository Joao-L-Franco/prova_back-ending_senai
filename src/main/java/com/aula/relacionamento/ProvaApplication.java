package com.aula.relacionamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.aula.relacionamento.repositories")

public class ProvaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvaApplication.class, args);
	}

}


