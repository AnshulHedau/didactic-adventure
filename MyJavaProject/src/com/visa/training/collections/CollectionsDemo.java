package com.visa.training.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class StringLengthComparator implements Comparator<String>
{
	public int compare(String s1, String s2)
	{
		return s1.length()-s2.length();
	}
	
	
}
public class CollectionsDemo {
	public static void main(String[] args) {
//		List<Double> doubles = demoList();
//		List<Double> destination = new ArrayList<>();
//		double sum = addList(doubles);
//		System.out.println(sum);
//		
//		List<Number> nList = new ArrayList<>();
//		copyFirstListToSecond(doubles, destination);
//		copyFirstListToSecond(doubles, nList);
//		demoMap();
//		demoSet();
		demoSortedList();
	}

	private static void demoSortedList() {
		String[] array = { "this", "is", "an", "unusual", "array" };
		List<String> words = Arrays.asList(array);
		System.out.println("Before Sort");
		System.out.println(words);
		System.out.println("After Sort");
		Collections.sort(words,new StringLengthComparator());
		System.out.println(words);

	}

	private static <T> void copyFirstListToSecond(List<T> src, List<? super T> dest) {
		for (T anElement : src) {
			dest.add(anElement);

		}
		System.out.println("Copied");
		for (Object double1 : dest) {
			System.out.println(double1);
		}

	}

	private static void demoSet() {
		Set<String> words = new TreeSet<>();
		while (true) {
			String aword = fromKeyboard("Enter a word");
			if (!words.add(aword)) {
				System.out.println("Thats a duplicate");
			}
			if (words.size() == 10) {
				break;
			}
		}
		System.out.println("-----List of Unique words-----");
		for (String individualWords : words) {
			System.out.println(individualWords);
		}

	}

	public static String fromKeyboard(String prompt) {
		Scanner s = new Scanner(System.in);
		System.out.println(prompt);
		return s.nextLine();
	}

	private static void demoMap() {
		Map<String, String> employees = new HashMap<>();
		employees.put("e001", "emp1");
		employees.put("e002", "emp2");
		employees.put("e003", "emp3");
		employees.put("e004", "emp4");

		while (true) {
			String id = fromKeyboard("Enter Employee id (or quit):");
			if (id.equalsIgnoreCase("quit")) {
				break;
			}
			if (employees.containsKey(id)) {
				System.out.println("Employee exists");
				System.out.println(employees.get(id));
			} else {
				System.out.println("No such employee");
			}
		}
		Set<String> keys = employees.keySet();
		for (String aKey : keys) {
			System.out.println(aKey + " ----> " + employees.get(aKey));
		}
	}

	@SuppressWarnings("unused")
	private static double addList(List<? extends Number> nList) {
		double sumOfList = 0;
		for (Number number : nList) {
			sumOfList += number.doubleValue();
		}
		System.out.println(sumOfList);
		return sumOfList;
	}

	@SuppressWarnings("unused")
	private static List<Double> demoList() {
		List<Double> randoms = new ArrayList<Double>();
		while (true) {
			double arandom = Math.random();
			if (arandom < 0.1) {
				break;
			}
			randoms.add(arandom);
		}
		System.out.println("There are " + randoms.size() + " of random numbers");

		Iterator<Double> it = randoms.iterator();

		/*
		 * while (it.hasNext()) { System.out.println(it.next()); }
		 */

		for (Double double1 : randoms) {
			System.out.println(double1);
		}
		return randoms;
	}
}
