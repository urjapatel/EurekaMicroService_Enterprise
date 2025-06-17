package com.sample.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaMicroServiceSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaMicroServiceSampleApplication.class, args);
	}

}
