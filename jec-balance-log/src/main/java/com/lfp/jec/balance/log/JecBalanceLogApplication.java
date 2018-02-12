package com.lfp.jec.balance.log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//微服务 - 注册服务，【使用Eureka时，等同于@EnableEurekaClient】
@EnableDiscoveryClient
public class JecBalanceLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(JecBalanceLogApplication.class, args);
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
