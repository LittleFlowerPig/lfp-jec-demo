package com.lfp.jec.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer		//声明为配置服务
public class JecConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(JecConfigApplication.class, args);
	}
}
