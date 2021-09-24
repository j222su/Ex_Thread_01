package com.js.example_thread;

public class MyThread extends Thread{

    ExampleThreadApplication exampleThreadApplication;

    public MyThread(ExampleThreadApplication exampleThreadApplication) {
        this.exampleThreadApplication = exampleThreadApplication;
    }

    @Override
    public void run() {
        for(int i = 0; i<1000; i++) {
            exampleThreadApplication.callMe(Thread.currentThread().getName());
        }
    }
}
