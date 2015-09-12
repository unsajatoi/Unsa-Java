//1g. Write a program that accepts input from the command line and then prints them.
package com.whitebox.edu;

import java.util.Scanner;

public class TakeInputAndPrints {

	public static void main(String[] args) {
		
		String a;
		System.out.println("Enter something");
		Scanner in = new Scanner (System.in);
		a = in.next();
		System.out.println(a);


	}

}
