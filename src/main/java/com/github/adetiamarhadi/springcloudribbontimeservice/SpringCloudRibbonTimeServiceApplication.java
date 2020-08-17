package com.github.adetiamarhadi.springcloudribbontimeservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@SpringBootApplication
@RestController
public class SpringCloudRibbonTimeServiceApplication {

	@Value("${server.port}")
	int port;

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudRibbonTimeServiceApplication.class, args);
	}

	@GetMapping
	public String getTime() {
		return "the current time is " + LocalDateTime.now().toString() + " (answered by service running on "+port+")";
	}

}
