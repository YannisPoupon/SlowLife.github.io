package com.slowlife.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@Configuration
@EnableAutoConfiguration
@EntityScan("com.slowlife.entity")
@ComponentScan("com.slowlife.service")
@ComponentScan("com.slowlife.controller")
@EnableJpaRepositories("com.slowlife.dao")
@SpringBootApplication
public class SlowLifeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlowLifeApplication.class, args);
	}

}
