//1d. Write a program to calculate factorial of a given number. You need to compute the factorial with logic without recursion.
package com.whitebox.edu;

public class NonRecursionFactorial {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(factorial(4));
	
	}
		
		
	public static int factorial (int input )
	{
	  int x, fact = 1;
	  for ( x = input; x > 1; x--)
	     fact *= x;
	     
	  return fact;

	}

	}


