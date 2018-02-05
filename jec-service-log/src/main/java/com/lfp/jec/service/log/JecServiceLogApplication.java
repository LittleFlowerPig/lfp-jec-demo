package com.lfp.jec.service.log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient			//声明为服务提供者
public class JecServiceLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(JecServiceLogApplication.class, args);
	}
}
