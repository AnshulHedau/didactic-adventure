package com.visa.training;

public class StackUser {
	public void fill(Stack s)
	{
		for(int i=0;i<20;i+=2)
		{
			s.push(i);
			System.out.println("Pushed -----> "+i);
		}
	}
	
	public void empty(Stack s)
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Poped -----> "+s.pop());
		}
	}
	
	
}
