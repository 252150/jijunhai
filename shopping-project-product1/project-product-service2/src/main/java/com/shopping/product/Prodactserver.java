package com.shopping.product;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
//'url' attribute is not specified and no embedded datasource could be configured.import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


//import com.shopping.product.mapper1.StudentMapperTest;




@SpringBootApplication
@EnableEurekaClient

@MapperScan("com.shopping.product.mapper")
@EnableFeignClients(basePackages="com.shopping.redis.interfase")
public class Prodactserver {
   public static void main(String[] args) {
	
	SpringApplication.run(Prodactserver.class, args);
}
}
