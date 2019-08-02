package com.visa.training.dos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class MyDOS {

	public static void main(String[] args) throws IOException {
		if (args[0].equalsIgnoreCase("dir")) {

			if (args.length > 1) {
				File fileList = new File(args[1]);
				for (String name : fileList.list()) {
					System.out.println(name);
				}
			} else {
				File fileList = new File(System.getProperty("user.dir"));
				for (String name : fileList.list()) {
					System.out.println(name);
				}
			}
		} else if (args[0].equalsIgnoreCase("type")) {

			if (args.length > 1) {
				File fileList = new File(args[1]);
				FileReader fr = new FileReader(fileList);
				BufferedReader br = new BufferedReader(fr);
				String in = br.readLine();
				System.out.println(in);
			}
		}

		else if (args[0].equalsIgnoreCase("copy")) {

			if (args.length == 3) {

		        long start = System.currentTimeMillis();
				try {
					File fileList = new File(args[1]);
					File fileListOutput = new File(args[2]);
					FileInputStream in = new FileInputStream(fileList);
					FileOutputStream out = new FileOutputStream(fileListOutput);
					

//					BufferedInputStream in = new BufferedInputStream(fileList);
//					BufferedOutputStream out = new BufferedOutputStream(fileListOutput);
					int aByte;
					while ((aByte = in.read()) != -1) {
						out.write(aByte);
					}
					in.close();
					out.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				long end = System.currentTimeMillis();
				System.out.println("Copying took " + (end - start) + " ms.");
			}
		}
	}

}
