package com.whitebox.edu;

public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println(calc(4));
	 }

	  public static long calc(long n){
	    if (n <= 1)
	        return 1;

	        else
	            return n * (n-1);
	  
		

	}

}
