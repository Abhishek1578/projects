package com.event;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventHandlerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventHandlerApplication.class, args);
		System.out.println("success");
	}

}
