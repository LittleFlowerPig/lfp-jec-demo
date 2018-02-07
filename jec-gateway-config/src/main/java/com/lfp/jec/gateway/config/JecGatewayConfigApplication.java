package com.lfp.jec.gateway.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient        	//声明为一个服务提供者
@EnableZuulProxy        	//声明为一个路由网关
public class JecGatewayConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(JecGatewayConfigApplication.class, args);
	}
}
