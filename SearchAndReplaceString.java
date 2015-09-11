//4b. Write a program to find a substring in a given string and then replace it with another string.
package com.whitebox.edu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class SearchAndReplaceString {
	
public static void countWord() throws FileNotFoundException  {
	String result = "";
	File file = new File("/home/hduser/test.txt");
	Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
			
			String nextToken = scanner.nextLine();
			result = nextToken.replace("the", "bird");
			System.out.println(result);
			
		}
		
	
}

	public static void main(String[] args) throws Exception {

countWord();
		
	}

}