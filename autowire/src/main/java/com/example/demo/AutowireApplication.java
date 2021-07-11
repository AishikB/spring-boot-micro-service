package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// Sinnce com.random does not fall in the base packages of the package where this class is present so we have to 
// explicitly define the base packages which needs to scanned for beans

@SpringBootApplication
@ComponentScan("com.random")
@ComponentScan("com.example.demo")
public class AutowireApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutowireApplication.class, args);
	}

}
