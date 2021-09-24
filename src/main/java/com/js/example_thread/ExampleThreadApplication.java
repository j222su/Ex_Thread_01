package com.js.example_thread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
public class ExampleThreadApplication {

	private HashMap<String, String > mHashMap01 = new HashMap<>();
	private HashMap<String, String > mHashMap02 = new HashMap<>();

	private final Object object01 = new Object();
	private final Object object02 = new Object();

	public static void main(String[] args) {
		SpringApplication.run(ExampleThreadApplication.class, args);

		System.out.println("Test Start");

		ExampleThreadApplication exampleThreadApplication = new ExampleThreadApplication();

		new Thread(()-> {
			for(int i = 0; i<5; i++) {
				exampleThreadApplication.put1("A", "B");
				exampleThreadApplication.get2("C");
			}
		}).start();

		new Thread(()-> {
			for(int i = 0; i<5; i++) {
				exampleThreadApplication.put2("C", "D");
				exampleThreadApplication.get1("A");
			}
		}).start();

		System.out.println("The end!!!");
	}

	public void put1(String key, String value) {
		synchronized (object01) {
			mHashMap01.put(key, value);
		}
	}

	public String get1(String key) {
		synchronized (object01) {
			return mHashMap01.get(key);
		}
	}

	public void put2(String key, String value) {
		synchronized (object02) {
			mHashMap02.put(key, value);
		}
	}

	public String get2(String key) {
		synchronized (object02) {
			return mHashMap02.get(key);
		}
	}

}
