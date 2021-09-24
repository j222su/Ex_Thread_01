package com.js.example_thread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleThreadApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleThreadApplication.class, args);
		
		Runnable myRunnable01 = new MyRunnable();
		Thread thread01ForRunnable = new Thread(myRunnable01);

		thread01ForRunnable.setName("myRunnable01");

		thread01ForRunnable.start();
	}

}
