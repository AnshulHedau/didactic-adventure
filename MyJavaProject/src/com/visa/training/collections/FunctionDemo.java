package com.visa.training.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {

	public static <T, R> List<R> transformedList(List<T> alist, Function<T, R> afun) {
		List<R> rlist = new ArrayList<>();
		for (T s : alist) {
			rlist.add((R) afun.apply(s));
		}
		return rlist;
	}
}
