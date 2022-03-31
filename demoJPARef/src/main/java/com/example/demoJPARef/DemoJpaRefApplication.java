package com.example.demoJPARef;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoJpaRefApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoJpaRefApplication.class, args);
		new Scanner(System.in).next();
	}

}
