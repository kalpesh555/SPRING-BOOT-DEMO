package com.microservices.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CurrencyCenversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyCenversionServiceApplication.class, args);
	}

}
	