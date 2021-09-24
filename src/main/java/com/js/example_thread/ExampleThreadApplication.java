package com.js.example_thread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleThreadApplication {

	private String mMsg;

	public static void main(String[] args) {
		SpringApplication.run(ExampleThreadApplication.class, args);

		System.out.println("Test Start");

		ExampleThreadApplication exampleThreadApplication = new ExampleThreadApplication();

		MyThread myThread01 = new MyThread(exampleThreadApplication);
		MyThread myThread02 = new MyThread(exampleThreadApplication);

		myThread01.setName("myThread01");
		myThread02.setName("myThread02");

		myThread01.start();
		myThread02.start();

		System.out.println("The end!!!");
	}

	public synchronized void callMe(String threadName) {
		mMsg=threadName;
		try {
			Thread.sleep((long) (Math.random()*100));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if(!mMsg.equals(threadName)) {
			System.out.println(threadName + " | "+mMsg);
		}
	}

}
