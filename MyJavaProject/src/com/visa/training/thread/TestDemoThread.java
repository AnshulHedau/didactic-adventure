package com.visa.training.thread;

public class TestDemoThread {

	public static void main(String[] args) throws InterruptedException {
		ThreadDemo td1 = new ThreadDemo(100, 10000);
		ThreadDemo td2 = new ThreadDemo(500, 5000);
		Thread t1 = new Thread(td1);
		Thread t2 = new Thread(td2);
		t1.start();
		t2.start();
		t1.join();
		t2.join();

	}

}
