package com.visa.training.collections;

@FunctionalInterface
public interface TwoStringPredicate<R> {
	
	 boolean isFirstBetter(R s1, R s2);
}
