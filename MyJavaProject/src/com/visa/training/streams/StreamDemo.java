package com.visa.training.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void append(String lItem) {
		System.out.println("  " + lItem);
	}

	public static void main(String[] args) {
		List<String> words = Arrays.asList("hib", "hello", "My", "name", "is", "Anshul", "Hedau");
//		words.stream().map(s->"  "+s).forEach(System.out::println);
//		words.stream().forEach(StreamDemo::append);
//		System.out.println(words.stream().map(s -> s + "!").collect(Collectors.toList()));
//		System.out.println(words.stream().map(s -> s.replace("i", "eye")).collect(Collectors.toList()));
//		System.out.println(words.stream().map(s -> s.toUpperCase()).collect(Collectors.toList()));
//		System.out.println(words.stream().filter(s -> s.length() < 4).collect(Collectors.toList()));
//		System.out.println(words.stream().filter(s -> s.contains("b")).collect(Collectors.toList()));
//		System.out.println(words.stream().filter(s -> (s.length() % 2)==0).collect(Collectors.toList()));
		System.out.println(words.stream().reduce("",(partialString, element) -> partialString + element.toUpperCase()));
		System.out.println(words.stream().map(s->s.toUpperCase()).reduce("",(partialString, element) -> partialString + element));
		
	}

}
