package com.cjc.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("Spring---Boot--Consumer--App--Running....");
		SpringApplication.run(Application.class, args);
	}
	

	@Bean
	public RestTemplate	 template() {
		
		return new RestTemplate();
	}
}
