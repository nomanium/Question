package com.question;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Question_1 {

	
	public static void main(String[] args) {
		System.out.println("Test");
		File file = new File("WordFile.txt");
		System.out.println("Does file exists:" + doesFileExist(file));
		readFile("WordFile.txt");

	}

	public static void readFile(String filepath) {

		try {
			File file = new File(filepath);
			if (!doesFileExist(file)) {
				System.out.println("File does not exists. Try again");
			} else {
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				String line;
				while ((line = bufferedReader.readLine()) != null) {
					printData(line);
				}
				fileReader.close();

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void printData(String line) {
		String tempData[] = line.split("–");
		if (tempData.length > 1) {
			String meaning[] = tempData[1].split(",");
			System.out.println("Word: " + tempData[0]);
			for (int i = 0; i < meaning.length; i++) {
				System.out.println("Meaning-" + (i+1) + ": " + meaning[i]);
			}
		}
	}

	public static boolean doesFileExist(File argFile) {

		if (argFile.exists() && !argFile.isDirectory())
			return true;
		else
			return false;
	}
}
