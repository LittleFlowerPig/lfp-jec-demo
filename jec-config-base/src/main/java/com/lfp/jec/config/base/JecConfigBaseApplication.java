package com.lfp.jec.config.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//配置服务 - 服务端
@EnableConfigServer
//微服务 - 注册服务
@EnableEurekaClient
public class JecConfigBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(JecConfigBaseApplication.class, args);
	}
}
