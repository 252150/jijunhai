package com.shopping.commons;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class CommonsServer {
	

	   public static void main(String[] args) {
		
		SpringApplication.run(CommonsServer.class, args);
	}

}
