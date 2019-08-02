package com.visa.training.collections;

import java.util.Arrays;
import java.util.List;

public class TestFunctionDemo {

	public static void main(String[] args) {
		String names[] = { "My", "Name", "is", "Anshul", "Hedau", "big" };
		List<String> words = Arrays.asList(names);
		List<String> excitingWords = FunctionDemo.transformedList(words, s -> s + "!");
		System.out.println(excitingWords);
		List<String> eyeWords = FunctionDemo.transformedList(words, s -> s.replace("i", "eye"));
		System.out.println(eyeWords);
		List<String> upperCaseWords = FunctionDemo.transformedList(words, String::toUpperCase);
		System.out.println(upperCaseWords);
		List<Integer> wordLengths = FunctionDemo.transformedList(words, String::length);
		System.out.println(wordLengths);
	}

}
