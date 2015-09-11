//3b. Write a program to find a substring in a given string and then replace it with another string.
package com.whitebox.edu;

public class StringReplace{
	
	
	public static void main(String[] args) 
    {
		String str = "abcd=0; efgh=1";
	    String replacedStr = str.replaceAll("abcd", "dddd");

	    System.out.println(str);
	    System.out.println(replacedStr);
    }
}

