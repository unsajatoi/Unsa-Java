//4c c. Write a program to search for a string in a file and then return the count of number of occurrences of the string.
package com.whitebox.edu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class CountNumberOfOccurrences {
	
public static int countWord(String word) throws FileNotFoundException  {
	int count = 0;
	File file = new File("/home/hduser/test.txt");
	Scanner scanner = new Scanner(file);
		while (scanner.hasNext()) {
		
			String nextToken = scanner.next();
			if (nextToken.equalsIgnoreCase(word))
				count++;
			
		}
	
	return count;
}

	public static void main(String[] args) throws Exception {
System.out.println(countWord("the"));
		
	}

}