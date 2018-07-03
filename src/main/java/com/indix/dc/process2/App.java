package com.indix.dc.process2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.indix" })
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}