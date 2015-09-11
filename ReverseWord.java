//3d. Write a program to reverse each individual word in a sentence.
package com.whitebox.edu;
public class ReverseWord{
	
	
	public static void main(String args[])
	   {
		String source = "Hello World";

		for (String part : source.split(" ")) {
		    System.out.print(new StringBuilder(part).reverse().toString());
		    System.out.print(" ");
		}
	   }
}

