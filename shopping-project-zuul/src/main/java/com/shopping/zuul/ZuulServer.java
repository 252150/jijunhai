package com.shopping.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableZuulProxy
@ComponentScan(basePackages = "com.shopping.zuul.config")
public class ZuulServer {
    public static void main(String[] args) {
		SpringApplication.run(ZuulServer.class, args);
	}
}
