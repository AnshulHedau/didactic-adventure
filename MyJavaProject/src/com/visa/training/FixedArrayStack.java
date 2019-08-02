package com.visa.training;

public class FixedArrayStack implements Stack {
	Object arrayStack[] = new Object[20];
	static int top = 0;

	@Override
	public void push(Object element) {
		if (top > 10) {
			System.out.println("Overflow");
			return;
		}
		arrayStack[++top] = element;

	}

	@Override
	public Object pop() {
		Object poped = arrayStack[top--];
		return poped;
	}
}
