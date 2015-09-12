//1c Swap Without Thir Variable
package com.whitebox.edu;
import java.util.Scanner;
public class SwapWithoutThirVariable {
	public static void main(String[] args) {
		
	int a ,b;
	System.out.println("Enter a and b");
	Scanner in = new Scanner (System.in);
	a = in.nextInt();
	b = in.nextInt(); 
	
	
	System.out.println("Before swapping\na = " + a  + "\nb = " +b);

	
	a = a-b;
	b = a+b;
	a=b-a;
	System.out.println("After Swapping\na =" + a+ "\nb" +b);
	
	
}
}
//c. Write a program that swaps 2 given numbers. You need to have 2 separate functions in the program.
//--> One Function should swap the numbers without any third new variable.
//--> Second function should swap the numbers using a third variable.
