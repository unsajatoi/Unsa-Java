//3a. Write a program to reverse a string.Donot use StringBuffer/StringBuilder inbuilt reverse function.
package com.whitebox.edu;
public class ReverseString{
	
	
	public static void main(String args[])
	   {
	      String reverse = "";
	      String original = "My name is Unsa";
	      int length = original.length();
	 
	      for ( int i = length - 1 ; i >= 0 ; i-- )
	         reverse = reverse + original.charAt(i);
	 
	      System.out.println("Reverse of entered string is: "+reverse);
	      
	   }
	
}

