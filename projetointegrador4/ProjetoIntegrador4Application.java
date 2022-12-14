package com.example.springprojeto.projetointegrador4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@EnableJpaRepositories
@CrossOrigin
public class ProjetoIntegrador4Application {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoIntegrador4Application.class, args);
	}

}