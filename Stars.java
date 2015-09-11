//1h. Write a program that prints a pattern.

package com.whitebox.edu;

public class Stars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;
		  for (int x = 1; x <= rows; x++)
	        {
	            for (int i = 1; i <= x; i++)
	            {
	                System.out.print("*");
	            }
	            System.out.println("");
	        }
	}

}
