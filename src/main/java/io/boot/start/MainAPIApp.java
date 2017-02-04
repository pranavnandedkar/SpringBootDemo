package io.boot.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainAPIApp {

	public static void main(String[] args) {
		System.out.println("Starting app..");
		SpringApplication.run(MainAPIApp.class, args);
	}
 }
