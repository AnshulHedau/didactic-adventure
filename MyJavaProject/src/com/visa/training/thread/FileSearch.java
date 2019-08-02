package com.visa.training.thread;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.visa.training.collections.CollectionsDemo;

public class FileSearch {

	public static void main(String[] args) {
		String fileName  = CollectionsDemo.fromKeyboard("Enter a fileName : ");
		String startAt = CollectionsDemo.fromKeyboard("Enter start location : ");
		File startFolder = new File(startAt);
		File[] contents = startFolder.listFiles();
		Queue<File> filesQueue = new LinkedList<>();
		filesQueue.addAll(Arrays.asList(contents));
		List<File> results = new ArrayList<>();
		
		SearchWorker w1 = new SearchWorker(fileName, filesQueue, results);
		SearchWorker w2 = new SearchWorker(fileName, filesQueue, results);
		SearchWorker w3 = new SearchWorker(fileName, filesQueue, results);
		SearchWorker w4 = new SearchWorker(fileName, filesQueue, results);
//		
		w1.start();
		w2.start();
		w3.start();
		w4.start();

		w1.run();
		w2.run();
		w3.run();
		w4.run();
		
		System.out.println(results+" Files found : "+results.size());
	}

}
