package com.pradeep.students_server_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StudentsServerRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentsServerRegistryApplication.class, args);
	}

}
