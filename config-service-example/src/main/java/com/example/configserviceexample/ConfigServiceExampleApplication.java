package com.example.configserviceexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServiceExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServiceExampleApplication.class, args);
	}

}
