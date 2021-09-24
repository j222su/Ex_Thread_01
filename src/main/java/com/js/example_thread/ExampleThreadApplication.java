package com.js.example_thread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleThreadApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleThreadApplication.class, args);

		MyThread myThread01 = new MyThread();

		myThread01.setName("myThread01");

		myThread01.start();

	}

}
