package com.javastar.asynchroFT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class AsynchroFtApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsynchroFtApplication.class, args);
	}

}
