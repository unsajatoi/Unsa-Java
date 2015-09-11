//4b. Write a program to count the number of words in a file.
package com.whitebox.edu;
import java.util.*;
import java.io.*;
class CountWordInFile
{
   public static void main(String args[]) throws FileNotFoundException
   {
	   File file = new File("/home/hduser/s.txt");
	   Scanner sc = new Scanner(new FileInputStream(file));
	   int count=0;
	   while(sc.hasNext()){
	       sc.next();
	       count++;
	   }
	   System.out.println("Number of words: " + count);
 
   }
}	
