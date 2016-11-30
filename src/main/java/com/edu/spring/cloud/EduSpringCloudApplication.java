package com.edu.spring.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RefreshScope
@RestController
public class EduSpringCloudApplication {
	@Value("${info.foo}")
	String name = "??";

	@RequestMapping("/")
	public String hime() {
		return name;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(EduSpringCloudApplication.class, args);
	}
}
