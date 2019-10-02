package com.tracfone.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.tracfone"})
public class MappingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MappingServiceApplication.class, args);
	}

}
