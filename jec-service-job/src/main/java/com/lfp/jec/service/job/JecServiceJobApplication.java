package com.lfp.jec.service.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient			//声明为服务提供者
public class JecServiceJobApplication {

	public static void main(String[] args) {
		SpringApplication.run(JecServiceJobApplication.class, args);
	}
}
