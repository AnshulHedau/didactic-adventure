package com.visa.training.thread;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

public class TestFileThread {

	static int count;

	public static void main(String[] args) {
		Queue<String> fileQueue = new LinkedList<>();
//		FileQueue.add("abc.txt");

		File file = new File("/root/eclipse-workspace/MyJavaProject/");

		String[] content = file.list();

		for (String entry : content) {
			file = new File(entry);
			if (file.isFile() && file.getName() == "abc.txt") {
				count++;
			}
			if (file.isDirectory()) {
				System.out.println(file.getAbsolutePath());
				fileQueue.add(file.getAbsolutePath());
			}
			System.out.println(entry + "->" + file.getName() + "->" + file.isFile());
		}
		System.out.println(count);
	}

}
