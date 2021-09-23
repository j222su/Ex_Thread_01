package com.js.example_thread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleThreadApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleThreadApplication.class, args);

		MyThread myThread01 = new MyThread();
		MyThread myThread02 = new MyThread();
		MyThread myThread03 = new MyThread();

		Runnable myRunnable01 = new MyRunnable();
		Runnable myRunnable02 = new MyRunnable();
		Runnable myRunnable03 = new MyRunnable();

		Thread thread01ForRunnable = new Thread(myRunnable01);
		Thread thread02ForRunnable = new Thread(myRunnable02);
		Thread thread03ForRunnable = new Thread(myRunnable03);

		myThread01.setName("myThread01");
		myThread02.setName("myThread02");
		myThread03.setName("myThread03");

		thread01ForRunnable.setName("myRunnable01");
		thread02ForRunnable.setName("myRunnable02");
		thread03ForRunnable.setName("myRunnable03");


		myThread01.start();
		thread01ForRunnable.start();
		myThread02.start();
		myThread03.start();
		thread02ForRunnable.start();
		thread03ForRunnable.start();

	}

}
