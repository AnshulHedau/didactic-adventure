package com.visa.training.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class StringEComparator implements Comparator<String>{
	public int compare(String s1,String s2)
	{
		return s1.indexOf("e")-s2.indexOf("e");
	}
}

public class CollectionLAMBDA {

	public static void main(String[] args) {
		String[] array = { "thise", "ies", "ane", "eunusueal", "arreay" };
		List<String> words = Arrays.asList(array);
		System.out.println("Before Sort");
		System.out.println(words);
		SortedList(words);
		reverseSortedList(words);
		firstElementSort(words);
		SortedListByE(words);
	}

	private static void firstElementSort(List<String> words) {

		System.out.println("After Sort by first element");
		Collections.sort(words, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
		System.out.println(words);

	}

	private static void reverseSortedList(List<String> words) {
		System.out.println("After reverse sort by length");
		Collections.sort(words, (s1, s2) -> s2.length() - s1.length());
		System.out.println(words);

	}

	private static void SortedList(List<String> words) {
		System.out.println("After Sort by length");
		Collections.sort(words, (s1, s2) -> s1.length() - s2.length());
		System.out.println(words);

	}

	private static void SortedListByE(List<String> words) {
		System.out.println("After Sort by E");
		Collections.sort(words, (s1,s2) -> s1.indexOf("e")-s2.indexOf("e"));
		System.out.println(words);

	}
}
