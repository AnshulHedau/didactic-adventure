package com.visa.training.collections;

public class FindBetterString {

	public static void main(String[] args) {
//		int c1 = 10;
//		int c2 = 20;
		Car car1 = new Car(10);
		Car car2 = new Car(20);
		String s1 = "Anshul";
		String s2 = "Hedau";
//		System.out.println(car1.cost);
//		System.out.println(car2.cost);
		System.out.println(BetterStringFinder.betterElement(car1, car2, (d1, d2) -> d1.getCost() > d2.getCost()).getCost());
	}
}

class Car {
	int cost;

	Car(int cost) {
		this.cost = cost;
	}

	int getCost() {
		return this.cost;
	}
}