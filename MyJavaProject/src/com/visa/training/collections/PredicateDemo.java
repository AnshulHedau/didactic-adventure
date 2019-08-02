package com.visa.training.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static <T> List<T> allMatches(List<T> alist,Predicate<T> apred)
	{
		List<T> rlist = new ArrayList<>() ;
		for(T s:alist)
		{
			if(apred.test(s))
			{
				rlist.add(s);
			}
		}
		return rlist;
		
	}
}
