//1d. Write a program to calculate factorial of a given number. You need to compute the factorial with one logic that uses recursion.
package com.whitebox.edu;

public class Factorial {

	
	public static void main(String[] args) {
		
		
		 System.out.println(calc(4));
	 }

	  public static int calc(int n){
          int result;
	    if (n <= 1)
	        return 1;

	       
	          result=  calc (n-1) *n;
                  return=result;
	  
		

	}

}
