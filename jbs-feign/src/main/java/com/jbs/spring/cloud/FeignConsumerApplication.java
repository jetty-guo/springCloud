package com.jbs.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author gs
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class FeignConsumerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(FeignConsumerApplication.class, args);
	}

}
