package com.visa.training.thread;

public class ThreadDemo extends Thread {

	int start;
	int stop;
	int countPrime;

	ThreadDemo(int start, int stop) {
		this.start = start;
		this.stop = stop;
	}

	public boolean isPrime(int a) {
		for (int i = 2; i < a / 2; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	public void run() {
		for (int i = start; i < stop; i++) {
			if (isPrime(i)) {
				countPrime++;
			}
		}
		System.out.println(start + " -> " + stop + " has " + countPrime + " primes");
	}

}
