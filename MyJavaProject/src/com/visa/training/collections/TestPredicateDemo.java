package com.visa.training.collections;

import java.util.Arrays;
import java.util.List;

public class TestPredicateDemo {

	public static void main(String[] args) {
		String names[] = { "My", "Name", "is", "Anshul", "Hedau", "big" };
		List<String> words = Arrays.asList(names);
		List<String> shortWords = PredicateDemo.allMatches(words, s -> s.length() < 4);
		System.out.println(shortWords);
		shortWords = PredicateDemo.allMatches(words, s -> s.contains("b"));
		System.out.println(shortWords);
		shortWords = PredicateDemo.allMatches(words, s -> (s.length() %2) == 0);
		System.out.println(shortWords);
		List<Integer> nums = Arrays.asList(1, 10, 100, 1000, 10000);
		System.out.println(nums);
		List<Integer> bigNums = PredicateDemo.allMatches(nums, n -> n > 500);
		System.out.println(bigNums);
	}

}
