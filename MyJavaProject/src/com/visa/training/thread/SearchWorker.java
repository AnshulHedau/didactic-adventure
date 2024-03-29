package com.visa.training.thread;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class SearchWorker extends Thread {

	String fileName;
	Queue<File> fileQueue;
	List<File> results;

	public SearchWorker(String fileName, Queue<File> fileQueue, List<File> results) {
		super();
		this.fileName = fileName;
		this.fileQueue = fileQueue;
		this.results = results;
	}

	@Override
	public void run() {
		while (true) {
			File aFileOrFolder = fileQueue.poll();
			if (aFileOrFolder == null) {
				break;
			}
			if (aFileOrFolder.isFile() && aFileOrFolder.getName().equalsIgnoreCase(fileName)) {
				results.add(aFileOrFolder);
			} else if (aFileOrFolder.isDirectory() && aFileOrFolder.canRead()) {
				File[] content = aFileOrFolder.listFiles();
				if (content != null) {
					fileQueue.addAll(Arrays.asList(content));
				}

			}
		}
	}

}
