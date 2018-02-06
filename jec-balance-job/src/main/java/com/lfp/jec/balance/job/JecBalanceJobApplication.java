package com.lfp.jec.balance.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient        	//声明为一个服务发现者
@EnableFeignClients				//声明为feign客户端
public class JecBalanceJobApplication {

	public static void main(String[] args) {
		SpringApplication.run(JecBalanceJobApplication.class, args);
	}
}
