//1. Loops: Below is the list of the programs that enables you to enhance your knowledge about loops(for/while) and conditional statements(if-else/switch).





//a. Write a program that prints a fibonaci series that is a sequence of numbers like0 1 1 2 3 5 8.You can vary the number of elements to be printed meaning you can print 10 numbers or 15 or 20 or any desired number.
package com.whitebox.edu;

public class Fibonacci {
	public static void main(String[] args) {
		int febCount = 15;
		int [] feb = new int [febCount];
		feb [0]= 0;
		feb [1]= 1;
		for (int i = 2; i < febCount; i++) {
			feb [i]= feb[i-1]+ feb [i-2];
			
			
			
		}
		
		for (int i = 0; i < febCount; i++) {
			System.out.println(feb[i] +" ");
			
		}
		
	}

}

