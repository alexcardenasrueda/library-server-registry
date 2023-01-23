package com.unir.library_server_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LibraryServerRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryServerRegistryApplication.class, args);
	}

}
