package com.lfp.jec.gateway.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
//API网关 - zuul
@EnableZuulProxy
//微服务 - 注册服务，【使用Eureka时，等同于@EnableEurekaClient】
@EnableDiscoveryClient
public class JecGatewayBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(JecGatewayBaseApplication.class, args);
	}
}
