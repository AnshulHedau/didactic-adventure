package com.visa.training;

public class StackApp {

	public static void main(String[] args) {
		StackUser stackUser = new StackUser();
		FixedArrayStack fixedArray = new FixedArrayStack();
		stackUser.fill(fixedArray);
		stackUser.empty(fixedArray);

	}

}
