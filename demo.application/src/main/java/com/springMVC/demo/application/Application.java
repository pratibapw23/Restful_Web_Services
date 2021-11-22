package com.springMVC.demo.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.springMVC.demo")
@EnableJpaRepositories("com.springMVC.demo.repository")
@EntityScan("com.springMVC.demo.model")
public class Application {

	public static void main(String[] args) {
SpringApplication.run(Application.class, args);
	}

}
