package com.lfp.jec.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer		//声明为一个服务注册中心
public class JecCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(JecCenterApplication.class, args);
	}
}
