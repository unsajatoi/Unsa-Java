1.// 
//c. Write a program that swaps 2 given numbers. You need to have 2 separate functions in the program.


//--> One Function should swap the numbers without any third new variable.

package com.whitebox.edu;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		
		int a,b,c;
		System.out.println("Enter a and b");
		Scanner in = new Scanner (System.in);
		a = in.nextInt();
		b = in.nextInt();
		
		System.out.println("Before swaping\na=" + a+ "\nb=" + b);
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("After swaping\na=" +a+ "\nb=" +b);

	}

}