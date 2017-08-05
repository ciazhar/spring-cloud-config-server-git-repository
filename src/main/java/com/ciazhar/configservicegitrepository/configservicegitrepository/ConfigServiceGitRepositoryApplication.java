package com.ciazhar.configservicegitrepository.configservicegitrepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServiceGitRepositoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServiceGitRepositoryApplication.class, args);
	}
}
