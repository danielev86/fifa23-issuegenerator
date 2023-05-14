package com.danielev86.fifa23issueservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.danielev86"})
@SpringBootApplication
public class Fifa23IssueserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Fifa23IssueserviceApplication.class, args);
	}

}
