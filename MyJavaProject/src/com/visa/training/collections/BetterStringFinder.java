package com.visa.training.collections;
public class BetterStringFinder{

	public static <T> T betterElement(T s1, T s2,TwoStringPredicate<T> con)
	{
		if(con.isFirstBetter(s1,s2))
		{
			return s1;
		}
		else
		{
			return s2;
		}
	}
}
